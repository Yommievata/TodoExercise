package se.lexicon.grouplnu;


import se.lexicon.grouplnu.model.Person;

public class App
{
    public static void main(String[] args) {


        Person peter = new Person(911, "Peter", "Johansson");
        Person person1 = new Person(564, "Bjorn",  "Magnus");


        System.out.println("Person = " + peter.getFirstName() + " " + peter.getLastName() + " with PersonID " + peter.getPersonId());
        System.out.println("Person1 = " + person1.getFirstName() + " " + person1.getLastName() + " with PersonID " + person1.getPersonId());

        peter.setFirstName("Peter");
        peter.setLastName("Johansson");
        peter.setPersonId(911);

    }
}
