package com.example.demo.controller;

import com.example.demo.model.RPChar;
import com.example.demo.repository.RPCharRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class RestCharController {

    @Autowired
    private RPCharRepository charRepository;

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/admin/charlist")
    public List<RPChar> charList() {
        return (List<RPChar>) charRepository.findAll();
    }

    /*@RequestMapping("/admin/charlist/{id}")
    public RPChar getChar(@PathVariable("id") Long id) {
        return charRepository.findOne(id);
    }*/
}
