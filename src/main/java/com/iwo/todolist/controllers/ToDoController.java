package com.iwo.todolist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ToDoController {
    @GetMapping("/test")
    public int test(){
        return 1;
    }
}
