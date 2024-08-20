package com.example.cucumbertests.todo_list_example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import todo.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoListDefinition {
    private List<Task> todoList;

    @Given("I have an empty to-do list")
    public void iHaveAnEmptyToDoList() {
        todoList = new ArrayList<>();
    }

    @When("I add the following tasks to the list:")
    public void iAddTheFollowingTasksToTheList(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);

        // Skip the header row (start loop from index 1)
        for (int i = 1; i < rows.size(); i++) {
            List<String> row = rows.get(i);
            todoList.add(new Task(row.get(0), row.get(1)));
        }
    }


    @Then("the to-do list should contain {int} tasks")
    public void theToDoListShouldContainTasks(int expectedCount) {
        assertEquals(expectedCount, todoList.size());
    }

    @And("the highest priority task should be {string}")
    public void theHighestPriorityTaskShouldBeBuyGroceries(String expectedTaskName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        Task highestPriority = todoList.stream().min(Comparator.comparing(Task::getPriority))
                .orElse(null);
        assertEquals(expectedTaskName, highestPriority.getName());
    }
}
