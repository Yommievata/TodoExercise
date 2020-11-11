package se.lexicon.grouplnu.model;

public class Person {

    private int personIdInitial;
    private int personIdFinal;
    private String firstName;
    private String lastName;

    //Constructor
    public Person(int personIdInitial, int personIdFinal, String firstName, String lastName){
        this.personIdInitial = personIdInitial;
        this.personIdFinal = personIdFinal;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonIdInitial() {
        return personIdInitial;
    }

    public void setPersonIdInitial(int personIdInitial) {
        this.personIdInitial = personIdInitial;
    }

    public int getPersonIdFinal() {
        return personIdFinal;
    }

    public void setPersonIdFinal(int personIdFinal) {
        this.personIdFinal = personIdFinal;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
