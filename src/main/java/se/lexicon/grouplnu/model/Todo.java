package se.lexicon.grouplnu.model;

public class Todo {

    private final int todoId;
    private String description;
    private boolean done;
    private Person assignee;


//    Person assignee = peter;

    //constructor to take todoId and description
    public Todo(int todoId, String description){
        this.todoId = todoId;
        this.description = description;

    }

    //creating the getters and setters


    public int getTodoId() {
        return todoId;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
