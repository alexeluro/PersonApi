package com.inspiredcoda.person.model;

import com.inspiredcoda.person.model.enums.Gender;

public class Person {

    private String name;
    private int age;
    private Gender gender;
    private String location;

    public Person() {
    }

    public Person(String name, int age, Gender gender, String location) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getLocation() {
        return location;
    }
}
