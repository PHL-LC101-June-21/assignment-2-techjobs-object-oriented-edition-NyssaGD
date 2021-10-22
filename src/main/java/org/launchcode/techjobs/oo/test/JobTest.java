package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.assertEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId()
    {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        Assert.assertNotEquals(jobOne.getId(), jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields ()
    {

    }

    @Test
    public void testJobsForEquality ()
    {

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine ()
    {
        Job jobOne = new Job();
        String output =jobOne.toString();
        //test first character
        assertEquals(output.charAt(0), '\n');
        //test last character
        assertEquals(output.charAt(output.length()-1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData ()
    {

    }

    @Test
    public void testToStringHandlesEmptyField ()
    {

    }
}

