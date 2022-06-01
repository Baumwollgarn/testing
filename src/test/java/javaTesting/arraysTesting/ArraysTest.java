package javaTesting.arraysTesting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void farcirArrayParcialment() {
        int[] nums = {0,1,2,3,4,5,6,7,8,9};

        Arrays.fill(nums, 5, 10, -1);

        for (int i = 0; i < nums.length; i++) {
            if (i < 5) {
                assertTrue(nums[i] == i);
            }
            else {
                assertTrue(nums[i] == -1);
            }
        }
    }

    @Test
    public void copiaRangMatriu() {
        String[] dies = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge"};

        String[] capDeSetmana = Arrays.copyOfRange(dies, 4, 7);

        assertEquals("Dissabte", capDeSetmana[1]);

        String[] feinersEsclaus = Arrays.copyOfRange(capDeSetmana, 0, 6);
        assertEquals("Divendres", feinersEsclaus[0]);

        feinersEsclaus[3] = "DiumengeGuay";
        feinersEsclaus[4] = "DiumengeChachi";
        feinersEsclaus[5] = "DiumengePiruli";
        assertEquals("DiumengeGuay", feinersEsclaus[3]);
    }

    @Test
    public void arraysIrregularsTest() {
        int[][] arrayIrregular = {
                {0,1,2,3,4},
                {0,1,2,3},
                {0,1,2},
                {0},
                {0,1,2,3,4,5}};

        assertEquals(5, arrayIrregular.length);
        assertEquals(6, arrayIrregular[4].length);
        }
    }
