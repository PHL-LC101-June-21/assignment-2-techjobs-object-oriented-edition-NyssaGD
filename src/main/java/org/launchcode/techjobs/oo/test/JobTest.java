package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

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
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job.getName().toString());
        assertEquals("ACME", job.getEmployer().toString());
        assertEquals("Desert", job.getLocation().toString());
        assertEquals("Quality Control", job.getPositionType().toString());
        assertEquals("Persistence", job.getCoreCompetency().toString());
        assertTrue(job instanceof Job);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality ()
    {
        Job jobOne = new Job();
        Job jobTwo = new Job();

        assertFalse(jobOne.equals(jobTwo));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine ()
    {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String output =job.toString();
        //test first character
        assertEquals(output.charAt(0), '\n');
        //test last character
        assertEquals(output.charAt(output.length()-1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData ()
    {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expected = '\n' +
                "ID: " + job.getId() + '\n' +
                "Name: " + job.getName() + '\n' +
                "Employer: " + job.getEmployer() + '\n' +
                "Location: " + job.getLocation() + '\n' +
                "Position Type: " + job.getPositionType() + '\n' +
                "Core Competency: " + job.getCoreCompetency() + '\n';
        assertEquals(expected, job.toString());

    }

    @Test
    public void testToStringHandlesEmptyField ()
    {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = '\n' +
                "ID: " + job.getId() + '\n' +
                "Name: " + job.getName() + '\n' +
                "Employer: " + job.getEmployer() + '\n' +
                "Location: Data not available"  + '\n' +
                "Position Type: " + job.getPositionType() + '\n' +
                "Core Competency: " + job.getCoreCompetency() + '\n';
        assertEquals(expected, job.toString());

    }
}

