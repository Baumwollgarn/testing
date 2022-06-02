package javaTesting.ExplorantJUnit;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.security.InvalidParameterException;

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
}
