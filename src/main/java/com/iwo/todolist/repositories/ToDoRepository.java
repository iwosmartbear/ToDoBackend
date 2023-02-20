package com.iwo.todolist.repositories;

import com.iwo.todolist.models.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoItem, String> {

}
