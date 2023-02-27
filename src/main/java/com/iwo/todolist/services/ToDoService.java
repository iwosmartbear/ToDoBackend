package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.repositories.ToDoRepository;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;
import org.springframework.stereotype.Service;
import static com.iwo.todolist.services.toDoServiceUtils.mapRequestDTOIntoToDoItem;
import static com.iwo.todolist.services.toDoServiceUtils.replaceAllFieldsInToDo;

import java.time.LocalDate;
import java.util.List;


@Service
public class ToDoService implements ToDoServiceInterface{

    public ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDoItem> getAllToDoItems(String ownerId) {

        return toDoRepository.findAllByOwnerId(ownerId);
    }

    public List<ToDoItem> getAllItemsBetweenGivenDates(LocalDate startDate, LocalDate endDate) {

        if (endDate.isBefore(startDate)){
        throw new RuntimeException("Start Date should not be later than end Date.");
        }

        List<ToDoItem> newList = toDoRepository.findAllByDueDateBetween(startDate, endDate);

        return newList;
    }

    public boolean editToDoItem(ToDoItem toDoItem) {
        ToDoItem toDoFromDB = toDoRepository.getReferenceById(toDoItem.getId());
        replaceAllFieldsInToDo(toDoFromDB, toDoItem);
        toDoRepository.save(toDoFromDB);

        return true;
    }

    public boolean createToDoItem(RequestBodyPostToDo requestBodyPostToDo) {
        ToDoItem item = mapRequestDTOIntoToDoItem(requestBodyPostToDo);
        toDoRepository.save(item);

        return true;
    }

    public boolean deleteToDoItem(ToDoItem toDoItem){
        toDoRepository.delete(toDoItem);

        return true;
    }



}
