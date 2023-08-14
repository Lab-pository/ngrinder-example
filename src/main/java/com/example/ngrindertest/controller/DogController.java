package com.example.ngrindertest.controller;

import com.example.ngrindertest.dto.DogResponse;
import com.example.ngrindertest.service.DogService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/dogs")
public class DogController {

    private final DogService dogService;

    public DogController(final DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DogResponse> readDogs() {
        return dogService.findDogs();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DogResponse readDog(@PathVariable final Long id) {
        return dogService.findDog(id);
    }
}
