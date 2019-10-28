package org.fasttrackit.todolist.transfer;

import org.fasttrackit.todolist.Domain.ToDoItem;
import org.fasttrackit.todolist.persistance.ToDoItemRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UpdateToDoItemRequest {

    private ToDoItemRepository toDoItemRepository = new ToDoItemRepository();

    private boolean done;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "UpdateToDoItemRequest{" +
                "done=" + done +
                '}';
    }

    public void updateToDoItem(long id, UpdateToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Update to-do-item" + request);
        toDoItemRepository.updateToDoItem(id, request.isDone());
    }

    public void deleteToDoItem(long id) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Deleting item" + id);
        toDoItemRepository.deleteToDoItem(id);
    }

    public List<ToDoItem> getToDoItems() throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Retrieving to-do-items ... ");
        return toDoItemRepository.getToDoItems();
    }
}
