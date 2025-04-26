package com.diego.antonio.imageLiteApi.infra.repository;

import com.diego.antonio.imageLiteApi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
    //Vai injetar um teste
}
