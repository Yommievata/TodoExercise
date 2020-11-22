package se.lexicon.grouplnu.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {


    @Test
    public void getPersonId() {
        //Arrange
        int personId = 1;
        String firstName = "Peter";
        String lastName = "Magnusson";

        //Act
        Person actual = new Person(personId, firstName, lastName);

        //Assert
        assertEquals(personId, actual.getPersonId());
        assertEquals(firstName, actual.getFirstName());
        assertEquals(lastName, actual.getLastName());
    }
    }

