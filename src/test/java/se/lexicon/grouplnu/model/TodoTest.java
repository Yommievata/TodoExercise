package se.lexicon.grouplnu.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class TodoTest {
    @Test
    public void getTodoId() {

        //Arrange
        final int todoId = 1;
        String description = "Create a Program";
        boolean done = true;

        //Act
        Todo actual = new Todo(todoId,description);

        //Assert
        assertEquals(todoId, actual.getTodoId());
        assertEquals(description, actual.getDescription());
    }
    }

