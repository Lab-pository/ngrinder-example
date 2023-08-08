package com.example.ngrindertest.dto;

import com.example.ngrindertest.domain.Cat;

public record CatResponse(Long id, String name, int age) {

    public static CatResponse from(final Cat cat) {
        return new CatResponse(cat.getId(), cat.getName(), cat.getAge());
    }
}
