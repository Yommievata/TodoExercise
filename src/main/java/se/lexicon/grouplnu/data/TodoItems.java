package se.lexicon.grouplnu.data;


import se.lexicon.grouplnu.model.Todo;

import java.util.Arrays;

public class TodoItems {
    private static Todo[] todos = {};

    public int size(){
        return todos.length;
    }

    public static Todo[] findAll() {
        return todos;
    }

    public Todo findById(int personId){
        for(int i = 0; i < size(); i++){
            if(todos[i].getTodoId() == personId){
                return todos[i];
            }
        }
        return null;
    }

    public Todo addTodoItem (String description){
        Todo newTodoItem = new Todo(TodoSequencer.nextTodoID(), description);
        todos = Arrays.copyOf(todos,size()+1);
        todos[size()-1] = newTodoItem;
        return newTodoItem;
    }
    public void clear(){
        todos = new Todo [0];
        TodoSequencer.resetTodoID();
    }
    
    
}
