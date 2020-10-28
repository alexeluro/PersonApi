package com.inspiredcoda.person.exceptions;

public class PeopleNotFoundException extends RuntimeException {

    public PeopleNotFoundException(String message) {
        super(message);
    }
}
