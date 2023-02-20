package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    public String editToDoItem() {
        //@TODO create this method
        return "Don't know what to send, but for sure it is going to be a success information";
    }

    public boolean createToDoItem() {
        ToDoItem item = new ToDoItem();
        item.setOwnerId("jaslkdja-asda-ad-asdasd");
        item.setTaskContent("ContentOfTask: "+new Date().toString());
        item.setCategory("All");
        item.setPriority((byte) 1);
        item.setCreatedAt(new Date());
        item.setIsOpen((byte) 1);
        item.setDueDate(new Date(new Date().getTime() + (1000 * 60 * 60 * 24)));

        toDoRepository.save(item);

        return true;
    }

    public String getAllItemsBetweenGivenDates(Date startDate, Date endDate) {
        //@TODO create this method
        return "Don't know what to send, but for sure it is going to be a success information";
    }


}
