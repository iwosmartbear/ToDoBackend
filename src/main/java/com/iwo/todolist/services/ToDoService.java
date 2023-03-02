package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.repositories.ToDoRepository;
import com.iwo.todolist.requestDTO.RequestBodyToDo;
import jakarta.transaction.Transactional;
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

    public List<ToDoItem> getAllItemsByOwnerIdAndBetweenGivenDates(String ownerId, LocalDate startDate, LocalDate endDate) {

        if (endDate.isBefore(startDate)){
        throw new RuntimeException("Start Date should not be later than end Date.");
        }

        List<ToDoItem> newList = toDoRepository.findAllByOwnerIdAndDueDateBetween(ownerId, startDate, endDate);

        return newList;
    }

    public boolean editToDoItem(RequestBodyToDo requestBodyToDo) {
        ToDoItem toDoFromDB = toDoRepository.findByExtId(requestBodyToDo.getExtId());
        replaceAllFieldsInToDo(toDoFromDB, requestBodyToDo);
        toDoRepository.save(toDoFromDB);

        return true;
    }

    public boolean createToDoItem(RequestBodyToDo requestBodyToDo) {
        ToDoItem item = mapRequestDTOIntoToDoItem(requestBodyToDo);
        toDoRepository.save(item);

        return true;
    }

    @Transactional
    public boolean deleteToDoItem(RequestBodyToDo requestBodyToDo){
        toDoRepository.deleteToDoItemByExtId(requestBodyToDo.getExtId());

        return true;
    }



}
