package com.inspiredcoda.person.service;

import com.inspiredcoda.person.model.Person;
import com.inspiredcoda.person.model.enums.Gender;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HomeRepository {

    private List<Person> people;

    public HomeRepository() {
         people = Arrays.asList(
                new Person("Will Smith", 53, Gender.MALE, "United States"),
                new Person("Chadwick Boseman", 32, Gender.MALE, "United States"),
                new Person("Chris Hemsworth", 43, Gender.MALE, "United States"),
                new Person("Ryan Reynolds", 39, Gender.MALE, "United States"),
                new Person("Jada Smith", 53, Gender.FEMALE, "United States"),
                new Person("Falana Folarin", 32, Gender.MALE, "Nigeria"),
                new Person("McCarthy Simons", 13, Gender.MALE, "United Kingdom"),
                new Person("Sytles Stilinski", 18, Gender.MALE, "United States"),
                new Person("Scarlett Johansson", 53, Gender.FEMALE, "United States"),
                new Person("Willow Smith", 53, Gender.FEMALE, "United States"),
                new Person("Jaden Smith", 53, Gender.MALE, "United States")
        );
    }

    public List<Person> getPeople(){
        return people;
    }


}
