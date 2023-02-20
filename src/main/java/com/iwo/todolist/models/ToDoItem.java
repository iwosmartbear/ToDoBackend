package com.iwo.todolist.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ToDoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String ownerId;

    private String taskContent;

    private String category;

    private Integer priority;

    private Integer isOpen;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Nullable
    private LocalDate closedAt;



//@TODO set optimized formats for sql


}
