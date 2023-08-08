package com.example.ngrindertest.repository;

import com.example.ngrindertest.domain.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
