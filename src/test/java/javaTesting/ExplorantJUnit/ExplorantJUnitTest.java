package javaTesting.ExplorantJUnit;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.security.InvalidParameterException;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ExplorantJUnitTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test (expected = IllegalArgumentException.class)
    public void testetjantIllegalArgumentException() {

        throw new IllegalArgumentException();
    }

    @Test
    public void illegalParameterTest() {
        expected.expect(IllegalArgumentException.class);

        throw new IllegalArgumentException();
    }

    @Test
    public void missatgeExepcioTest () {
        expected.expect(IllegalArgumentException.class);
        expected.expectMessage("de");

        throw new IllegalArgumentException("Missatge de prova");
    }

    @BeforeClass
    public static void executaUnCopPerClasseAbansDeQualsevolTest() {
        System.out.println("Abans de qualsevol test, un cop per classe");
    }

    @AfterClass
    public static void executaUnCopPerClasseDespresDeQualsevolTest() {
        System.out.println("Després de qualsevol test, un cop per classe");
    }

    @Before
    public void executaAbansDeCaCadaTest() {
        System.out.println("Abans de cada test");
    }

    @After
    public void executaDespresDeCaCadaTest() {
        System.out.println("Després de cada test");
    }

    @Test
    public void assercionsDeJUnit() {

        assertEquals(1, 10-9);

        assertFalse("false es false", false);
        assertFalse(false);

        int[] finsA10 = {1,2,3,4,5,6,7,8,9,10};
        int[] primers10 = {2,1,3,4,5,6,7,8,9,10};

        Arrays.sort(primers10);

        assertArrayEquals(finsA10, primers10);

        assertNotNull("Un string buit NO es null", "");

        assertNotSame("Un string buit NO es null", "", null);
        assertNotSame("", null);

        assertNull("Un string buit es null", null);

        assertSame(null,null);
    }

    @Test
    public void assertThatAmbHamcrest() {

        assertThat(4+9, is(13));

        assertThat("False is false", false, equalTo(false));

        assertThat(false, is(false));

        assertThat("True is true", true, equalTo(true));

        assertThat(true, is(true));

        assertThat("A string is not empty", "", is( not( nullValue() ) ));

        assertThat("A string is not empty", containsString("not"));

        assertThat("A string is not empty", endsWith("empty"));

        assertThat("A string is not empty", startsWith("A"));

    }
}
