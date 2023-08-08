package com.example.ngrindertest.dto;

import com.example.ngrindertest.domain.Dog;

public record DogResponse(Long id, String name, int age) {

    public static DogResponse from(final Dog dog) {
        return new DogResponse(dog.getId(), dog.getName(), dog.getAge());
    }
}
