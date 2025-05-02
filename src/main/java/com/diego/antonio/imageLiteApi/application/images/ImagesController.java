package com.diego.antonio.imageLiteApi.application.images;

import com.diego.antonio.imageLiteApi.domain.entity.Image;
import com.diego.antonio.imageLiteApi.domain.enums.ImageExtension;
import com.diego.antonio.imageLiteApi.domain.service.ImageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController //Receber requisições HTTP
@RequestMapping("/v1/images") //Qual será o URL que irá acessar
@Slf4j //Lombok é uma biblioteca Java que gera automaticamente código repetitivo
@RequiredArgsConstructor

public class ImagesController {

    private final ImageService service;
    private final ImageMapper mapper;

    private static final Logger log = LoggerFactory.getLogger(ImagesController.class);

    @PostMapping
    public ResponseEntity save( //informar qual foi o resultado onde vai salvar imagens
                                //vamos receber dados UPLOAD
                                //Parametro Receber aquivos do browser/navegador
                                @RequestParam("file") MultipartFile file,
                                @RequestParam("name") String name,
                                @RequestParam("tags") List<String> tags
                                ) throws IOException {
        log.info("Imagem recebida: name:{},size:{}",file.getOriginalFilename(),file.getSize());

        Image image = mapper.mapToImage(file,name,tags);
        Image savedImage = service.save(image);

        

        return ResponseEntity.ok().build(); //Classe responsavel para dar uma resposta HTTP se for ok
        //codigo 200 quer dizer ok
    }
}
