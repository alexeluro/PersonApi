package com.inspiredcoda.person.controller;


import com.inspiredcoda.person.exceptions.PersonNotFoundException;
import com.inspiredcoda.person.model.Person;
import com.inspiredcoda.person.service.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("dev/person/v1/")
public class HomeController {

    @Autowired
    private HomeRepository personService;

    @GetMapping("person")
    public String welcome(){
        return "Hello Alex";
    }

    @GetMapping("people")
    public List<Person> getPeople(){
        return personService.getPeople();
    }


    @GetMapping("peoples")
    public List<Person> getFilterPeople(
            @RequestParam(name = "age") int personAge,
            @RequestParam(name = "name") String personName
    ){
        return personService.getPeople().stream()
                .filter(person -> person.getName().contains(personName))
                .filter(person -> person.getAge() >= personAge)
                .collect(Collectors.toList());
    }

    @GetMapping("person/filter")
    public Person getFilterPerson(@RequestParam(name = "name") String personName){
        return personService.getPeople().stream()
                .filter(person -> person.getName().contains(personName))
                .findAny()
                .orElseThrow(() -> new PersonNotFoundException(String.format("Unable to find %s", personName)));
    }

}
