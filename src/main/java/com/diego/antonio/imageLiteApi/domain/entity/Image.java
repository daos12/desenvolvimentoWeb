package com.diego.antonio.imageLiteApi.domain.entity;

//nova versão do JPA -> Jakarta, antigo Javax
import com.diego.antonio.imageLiteApi.domain.enums.ImageExtension;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_image") //nome da tabela do bd
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //vai gerar os valores de id
    private String id;
    @Column
    private String name;
    @Column
    private Long size;
    @Column
    @Enumerated(EnumType.STRING)//Guardar a ordem da extenção em nome não numerico
    private ImageExtension extesion;
    @Column
    @CreatedDate
    private LocalDateTime uploadDate;
    @Column
    private String tags;
    @Column
    @Lob
    private byte[] file; //representa as imagens que seram selecionadas
}
