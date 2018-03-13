package com.example.demo.repository;

import com.example.demo.model.RPChar;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RPCharRepository extends CrudRepository<RPChar, Long> {

    List<RPChar> findByName(String name);
}
