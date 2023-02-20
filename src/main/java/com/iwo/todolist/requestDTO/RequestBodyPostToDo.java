package com.iwo.todolist.requestDTO;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Data
public class RequestBodyPostToDo {

    private String ownerId;

    private String taskContent;

    private String category;

    private Integer priority;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;
}
