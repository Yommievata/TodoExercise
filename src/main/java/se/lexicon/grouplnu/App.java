package se.lexicon.grouplnu;


import se.lexicon.grouplnu.model.Person;
import se.lexicon.grouplnu.model.Todo;

public class App
{
    public static void main(String[] args) {

        Person peter = new Person(911, "Peter", "Johansson");
        Person person1 = new Person(564, "Bjorn",  "Magnus");


        System.out.println("Person = " + peter.getFirstName() + " " + peter.getLastName() + " with PersonID " + peter.getPersonId());
        System.out.println("Person1 = " + person1.getFirstName() + " " + person1.getLastName() + " with PersonID " + person1.getPersonId());

        peter.setFirstName("Peter");
        peter.setLastName("Johansson");


        Todo todoJob1 = new Todo(1, "create a program");
        System.out.println(person1.getFirstName() + " assigned job ID " + todoJob1.getTodoId() + " to " + todoJob1.getDescription());


        todoJob1.setDescription(" ");
        todoJob1.setDone(true);
        todoJob1.setAssignee(person1);

    }


}
