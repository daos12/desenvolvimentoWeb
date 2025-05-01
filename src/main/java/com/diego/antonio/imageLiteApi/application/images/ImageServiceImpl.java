package com.diego.antonio.imageLiteApi.application.images;

import com.diego.antonio.imageLiteApi.domain.entity.Image;
import com.diego.antonio.imageLiteApi.domain.service.ImageService;
import com.diego.antonio.imageLiteApi.infra.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository repository;

    @Override
    @Transactional
    public Image save(Image image) {
        return repository.save(image);
    }
}
