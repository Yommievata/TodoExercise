package se.lexicon.grouplnu.data;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonSequencerTest {

 PersonSequencer personSequencer;
    @Test
    public void nextPersonId() {
        int expectedValue = 1;
        Assert.assertEquals(expectedValue,PersonSequencer.nextPersonId());
    }

    @Test
    public void reset() {

    }
}