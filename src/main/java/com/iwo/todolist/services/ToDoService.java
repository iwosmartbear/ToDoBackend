package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.repositories.ToDoRepository;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;
import org.springframework.stereotype.Service;
import static com.iwo.todolist.services.toDoServiceUtils.mapRequestDTOIntoToDoItem;
import static com.iwo.todolist.services.toDoServiceUtils.replaceAllFieldsInToDo;

import java.util.Date;
import java.util.List;


@Service
public class ToDoService implements ToDoServiceInterface{

    public ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDoItem> getAllToDoItems() {

        return toDoRepository.findAll();
    }

    public String getOneToDoItem(String itemId) {
        //@TODO create this method

        return "Object with json sent back to controller";
    }
    public String getAllItemsBetweenGivenDates(Date startDate, Date endDate) {
        //@TODO create this method
        return "Don't know what to send, but for sure it is going to be a success information";
    }

    public boolean editToDoItem(ToDoItem toDoItem) {
        ToDoItem toDoFromDB = toDoRepository.getReferenceById(toDoItem.getId());
        replaceAllFieldsInToDo(toDoItem, toDoFromDB);
        toDoRepository.save(toDoItem);

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
