/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.joda.time.DateTime;
import static org.junit.Assert.*;
import mgriffin20.ct417assignment1partA.Student;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Meadhbh
 */
public class StudentTest {

    @Test
    public void studentTest() {
        DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime birthday = dtf.parseDateTime("30/07/1997");
        Student s = new Student("Meadhbh Griffin", "21", birthday, "15366976");
        String expected = "Meadhbh Griffin 21";
        assertEquals(expected, s.getUsername());
    }

    @Test
    public void hola() {
        assertTrue(true);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
