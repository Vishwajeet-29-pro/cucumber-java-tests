package com.example.cucumbertests.todo_list_example;

import io.cucumber.java.en.Given;
import todo.Task;

import java.util.ArrayList;
import java.util.List;

public class TodoListDefinition {
    private List<Task> todoList;

    @Given("I have an empty to-do list")
    public void iHaveAnEmptyToDoList() {
        todoList = new ArrayList<>();
    }

}
