package com.iwo.todolist.requestDTO;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class RequestBodyToDo {
    @Id
    @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$")
    private String extId;
    @NotBlank(message = "Bad User Id")
    @Pattern(regexp="^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$")
    private String ownerId;

    @NotBlank(message = "Description of task should not be empty")
    @Size(min = 3, max = 200, message = "Description of task should be betweeen 3 and 200 characters long")
    private String taskContent;

    @NotBlank(message = "Category of task should not be empty")
    @Size(min = 2, max = 15,message = "Category of task should between 2 and 15 characters long")
    private String category;


    @Min(value = 1, message = "Priority of task should be between 1 and 5")
    @Max(value = 5, message = "Priority of task should be between 1 and 5")
    private Integer priority;


    @Min(value = 0, message = "The task should be open or closed")
    @Max(value = 1, message = "The task should be open or closed")
    private Integer isOpen;


    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;
}
