package javaTesting.arraysTesting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArraysTest {

    @Test
    public void exampleArraySenzill() {
        String[] numerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        assertEquals("I", numerals[0]);

        String nombre = "";
        for (String n : numerals) {
            nombre += n + "|";
        }

        assertEquals("I|II|III|IV|V|VI|VII|VIII|IX|", nombre);
    }

    @Test
    public void provesOrdenacioArray() {
        int[] array = {5, 3, 1, 4, 2};

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(i + 1, array[i]);
        }
    }
}
