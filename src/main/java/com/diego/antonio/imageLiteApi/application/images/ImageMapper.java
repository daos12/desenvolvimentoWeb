package com.diego.antonio.imageLiteApi.application.images;

import com.diego.antonio.imageLiteApi.domain.entity.Image;
import com.diego.antonio.imageLiteApi.domain.enums.ImageExtension;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Component
public class ImageMapper {

    public Image mapToImage(MultipartFile file, String name, List<String> tags) throws IOException {
        return Image.builder()
                .name(name)
                .tags(String.join(",",tags))
                .size(file.getSize())
                .extesion(ImageExtension.valueOf(MediaType.valueOf(file.getContentType())))
                .file(file.getBytes())
                .build();
    }
}
