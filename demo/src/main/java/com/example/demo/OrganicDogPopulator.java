package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.demo.models.OrganicDog;
import com.example.demo.repositories.OrganicDogRepository;

@Component
public class OrganicDogPopulator implements CommandLineRunner{
    @Autowired
    private OrganicDogRepository organicDogRepository;
    
    @Override
    public void run(String... args) throws Exception {

        final Logger logger = LoggerFactory.getLogger(Populator.class);

        OrganicDog organicDog1 = new OrganicDog("Duke", "A beautiful Golden Retriever who loves to play");
        organicDogRepository.save(organicDog1);

        OrganicDog organicDog2 = new OrganicDog("Chewy", "A rough looking mutt who is full of fun");
        organicDogRepository.save(organicDog2);

        logger.info("Saved organicDog: {}", organicDog1);
        logger.info("Saved organicDog: {}", organicDog2);

    }
}
