package com.iwo.todolist.repositories;

import com.iwo.todolist.models.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDoItem, String> {
    List<ToDoItem> findAllByOwnerIdAndDueDateBetween(String ownerId, LocalDate startDate, LocalDate endDate);
    List<ToDoItem> findAllByOwnerId(String ownerId);
}
