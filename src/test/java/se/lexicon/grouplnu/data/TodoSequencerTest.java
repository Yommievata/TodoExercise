package se.lexicon.grouplnu.data;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TodoSequencerTest {

    @Test
    public void nextTodoID() {
        int expectedValue = 1;
        Assert.assertEquals(expectedValue,TodoSequencer.nextTodoID());
    }

    @Test
    public void resetTodoID() {
    }
}