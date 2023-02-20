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

    private byte priority;

    private byte isOpen;

    private Date createdAt;

    private Date dueDate;

    @Nullable
    private Date closedAt;



//@TODO set optimized formats for sql


}
