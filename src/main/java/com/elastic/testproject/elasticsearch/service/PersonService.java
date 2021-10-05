package com.elastic.testproject.elasticsearch.service;

import com.elastic.testproject.elasticsearch.document.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

//    @Autowired
//    private final PersonRepository repository;

    public PersonService() {
//        this.repository = repository;
    }

    public void save(final Person person) {
//        repository.save(person);
    }

    public Person findById(final String id) {
//        return repository.findById(id).orElse(null);
        return new Person();
    }

}
