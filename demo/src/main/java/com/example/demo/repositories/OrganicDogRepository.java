package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.OrganicDog;

public interface OrganicDogRepository extends CrudRepository<OrganicDog, Long> {

}
