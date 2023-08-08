package com.example.ngrindertest.service;

import com.example.ngrindertest.domain.Cat;
import com.example.ngrindertest.domain.Dog;
import com.example.ngrindertest.dto.CatResponse;
import com.example.ngrindertest.dto.DogResponse;
import com.example.ngrindertest.repository.DogRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class DogService {

    private final DogRepository dogRepository;

    public DogService(final DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public List<DogResponse> findDogs() {
        return dogRepository.findAll().stream()
            .map(DogResponse::from)
            .toList();
    }

    public DogResponse findDog(final Long id) {
        final Dog dog = dogRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("not found dog by id"));

        return DogResponse.from(dog);
    }

}
