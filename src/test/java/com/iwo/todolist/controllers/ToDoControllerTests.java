package com.iwo.todolist.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

public class ToDoControllerTests {

    @Test
    public void testToDoController(){
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/";


//        List<ToDoItem> listOfToDos = restTemplate.getForObject(url, List<ToDoItem>);
    }
}
