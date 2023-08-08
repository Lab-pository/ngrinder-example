package com.example.ngrindertest.controller;

import com.example.ngrindertest.dto.CatResponse;
import com.example.ngrindertest.service.CatService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cats")
public class CatController {

    private final CatService catService;

    public CatController(final CatService catService) {
        this.catService = catService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CatResponse> readCats() {
        return catService.findCats();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CatResponse readCat(@PathVariable final Long id) {
        return catService.findCat(id);
    }
}
