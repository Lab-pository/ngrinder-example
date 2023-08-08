package com.example.ngrindertest.repository;

import com.example.ngrindertest.domain.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {

}
