package javaTesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerStudyTest {

    @Test
    public void integerStudy() {

        Integer eight = new Integer(8);
        Integer twenty = new Integer("20");
        Integer nine = 9;
        int estimated = 9;

        int minim = -2147483648;
        int maxim = Integer.MAX_VALUE;

        assertEquals("Number nine equals 9", estimated, nine.intValue());

        assertEquals("Number twenty equals 20", 20, twenty.intValue());

        assertEquals(" Minimum of a int is -2147483648", minim, Integer.MIN_VALUE);
    }

    @Test
    public void integerComparationStudy() {

        Integer eight = new Integer(8);
        Integer acht = new Integer("8");

        assertEquals("Number eigth equals 8", 8, acht.intValue());

        assertEquals("Number eigth equals 8", 8, eight.intValue());

        // assertTrue (eight == acht);
        assertTrue(eight.equals(acht));

    }

    @Test
    public void binaryStudy() {

        Integer two = new Integer(2);

        String tipusPersones = "Hi ha " + Integer.toBinaryString(two) + " persones";

        assertEquals(tipusPersones,2,two.intValue());
    }
}
