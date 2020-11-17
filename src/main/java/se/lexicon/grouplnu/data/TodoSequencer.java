package se.lexicon.grouplnu.data;

public class TodoSequencer {

    private static int todoID;

    public static int nextTodoID(){
         todoID = ++todoID;
        return todoID;
    }
    public static void resetTodoID(){
        todoID = 0;
    }
}
