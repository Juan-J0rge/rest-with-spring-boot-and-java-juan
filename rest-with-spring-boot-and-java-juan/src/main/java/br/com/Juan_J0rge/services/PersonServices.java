package br.com.Juan_J0rge.services;

import br.com.Juan_J0rge.exception.ResourceNotFoundException;
import br.com.Juan_J0rge.model.Person;
import br.com.Juan_J0rge.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service // fica disponivel e vai ser injetado aonde eu preciso usar ele.
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    PersonRepository repository;

    private Logger logger = Logger.getLogger(PersonServices.class.getName());


    public List<Person> findByAll() {
        logger.info("Finding one Person!");
        return repository.findAll();
    }



    public Person findById(Long id) {
        logger.info("Finding one Person!");

        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));

    }


    public Person create(Person person) {
        logger.info("Creating one Person!");
        return repository.save(person);
    }

    public Person update(Person person) {
        logger.info("Updating one Person!");
        Person entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAdress(person.getAdress());
        entity.setGender(person.getGender());


        return  repository.save(person);

    }

    public void delete(Long id) {
        logger.info("Deleting one Person!");
         Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));

         repository.delete(entity);
    }
}

