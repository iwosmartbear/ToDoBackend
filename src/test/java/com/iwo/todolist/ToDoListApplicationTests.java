package com.iwo.todolist;

import com.iwo.todolist.controllers.ToDoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ToDoListApplicationTests {

    @Autowired
    ToDoController toDoController;

    @Test
    void contextLoads() {
        assertThat(toDoController).isNotNull();
    }

}
