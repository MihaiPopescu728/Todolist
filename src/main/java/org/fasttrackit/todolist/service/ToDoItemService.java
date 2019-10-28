package org.fasttrackit.todolist.service;

import org.fasttrackit.todolist.Domain.ToDoItem;
import org.fasttrackit.todolist.persistance.ToDoItemRepository;
import org.fasttrackit.todolist.transfer.CreateToDoItemRequest;
import org.fasttrackit.todolist.transfer.UpdateToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ToDoItemService {
    private ToDoItemRepository toDoItemRepository = new ToDoItemRepository();

    public void createToDoItem(CreateToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Create to-do-item" + request);
        toDoItemRepository.createTdoDoItem(request);
    }

    public void updateTodoItem(long id, UpdateToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Updating to-do-item + request");
        toDoItemRepository.updateToDoItem(id, request.isDone());
    }

    public void deleteToDoItem(long id) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Deleting item " + id);
        toDoItemRepository.deleteToDoItem(id);
    }

    public List<ToDoItem> getToDoItem() throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Retrieving to-do-items... ");
        return toDoItemRepository.getToDoItems();
    }

    public void getToDoItems() {
    }
}
