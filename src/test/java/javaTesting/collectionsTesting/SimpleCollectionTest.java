package javaTesting.collectionsTesting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SimpleCollectionTest {

    @Test
    public void firstCollectionTest() {
        String[] nombres = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};

        List<String> numerals = new ArrayList<>();

        for (String nombre : nombres) {
            numerals.add(nombre);
        }
        assertTrue(numerals.size() == 10);

        List<String> llistNumeros = Arrays.asList(nombres);
        assertTrue(llistNumeros.size() == 10);

    }
}
