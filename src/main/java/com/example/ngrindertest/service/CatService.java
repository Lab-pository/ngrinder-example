package com.example.ngrindertest.service;

import com.example.ngrindertest.domain.Cat;
import com.example.ngrindertest.dto.CatResponse;
import com.example.ngrindertest.repository.CatRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CatService {

    private final CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<CatResponse> findCats() {
        return catRepository.findAll().stream()
            .map(CatResponse::from)
            .toList();
    }

    public CatResponse findCat(final Long id) {
        Cat cat = catRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("not found cat by id"));

        return CatResponse.from(cat);
    }
}
