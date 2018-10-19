import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import mgriffin20.ct417assignment1partA.Student;

/**
 *
 * @author Meadhbh
 */
public class StudentTest {

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
    
    @Test
    public void studentTest() {
        DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime birthday = dtf.parseDateTime("30/07/1997");
        Student s = new Student("Meadhbh Griffin", "21", birthday, "15366976");
        String expected = "Meadhbh Griffin 21";
        assertEquals(expected, s.getUsername());
    }
}
