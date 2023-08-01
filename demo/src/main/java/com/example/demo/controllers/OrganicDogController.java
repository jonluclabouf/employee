package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.OrganicDog;
import com.example.demo.repositories.OrganicDogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/organicdog")
public class OrganicDogController {

    @Autowired
    private OrganicDogRepository organicDogRepository;

    @GetMapping("/{id}")
    public OrganicDog getOrganicDogById(@PathVariable long id) {
        return organicDogRepository.findById(id).orElse(null);
    }

    @PostMapping("/new")
    public OrganicDog createOrganicDog(@RequestBody OrganicDog newOrganicDog) {
        return organicDogRepository.save(newOrganicDog);
    }
}