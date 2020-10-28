package com.inspiredcoda.person.controller;

import com.inspiredcoda.person.exceptions.PeopleNotFoundException;
import com.inspiredcoda.person.exceptions.PersonNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {


    @ResponseBody
    @ExceptionHandler(PersonNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String personNotFoundHandler(PersonNotFoundException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(PeopleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String peopleNotFoundHandler(PeopleNotFoundException ex){
        return ex.getMessage();
    }


}
