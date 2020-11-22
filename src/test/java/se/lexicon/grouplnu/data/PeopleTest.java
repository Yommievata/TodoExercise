package se.lexicon.grouplnu.data;

import org.junit.Test;
import se.lexicon.grouplnu.model.Person;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void findById() {
        //Arrange
        int personId = 0;
        String firstName = "Simon";
        String lastName = "Elbrink";

        //Act
        Person actual = new Person(personId, firstName, lastName);

        //Assert
        assertEquals(personId, actual.getPersonId());
        assertEquals(firstName, actual.getFirstName());
        assertEquals(lastName, actual.getLastName());
    }
}


