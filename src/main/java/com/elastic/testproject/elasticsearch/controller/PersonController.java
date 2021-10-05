package com.elastic.testproject.elasticsearch.controller;

import com.elastic.testproject.elasticsearch.document.Person;
import com.elastic.testproject.elasticsearch.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/person")
@AllArgsConstructor
public class PersonController {

    private final PersonService service;

    @PostMapping()
    public void save(@RequestBody final Person person) {
        service.save(person);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable final String id) {
        return service.findById(id);
    }

}
