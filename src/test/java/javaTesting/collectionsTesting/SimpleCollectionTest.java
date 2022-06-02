package javaTesting.collectionsTesting;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

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

    @Test
    public void diesSetmana() {
        List<String> diesSetmana = new ArrayList<>();
        List<String> diesFeiners = new ArrayList<>();
        List<String> diesCapDeSetmana = new ArrayList<>();
        List<String> diesFeinersSenars = new ArrayList<>();
        List<String> diesSenars = new ArrayList<>();
        List<String> calculDies = new ArrayList<>();


        initDiesFeiners(diesFeiners);

        assertTrue(diesFeiners.size() == 5);

        assertEquals(diesFeiners.get(0), "Dilluns");
        assertEquals(0,diesSetmana.toArray().length);
        assertFalse(diesSetmana.containsAll(diesFeiners));

        diesSetmana.addAll(diesFeiners);

        assertEquals(5,diesSetmana.toArray().length);
        assertTrue(diesSetmana.containsAll(diesFeiners));

        diesCapDeSetmana.add("Dissabte");
        diesCapDeSetmana.add("Diumenge");

        diesSetmana.addAll(diesCapDeSetmana);

        assertEquals(7,diesSetmana.toArray().length);
        assertTrue(diesSetmana.containsAll(diesCapDeSetmana));


        diesSenars.addAll(diesSetmana);

        assertTrue(diesSenars.contains("Dimarts"));
        diesSenars.remove(1);
        assertFalse(diesSenars.contains("Dimarts"));

        diesSenars.remove("Dijous");
        assertFalse(diesSenars.contains("Dijous"));


        diesFeinersSenars.addAll(diesSenars);

        diesFeinersSenars.removeAll(diesCapDeSetmana);

        assertTrue(diesFeinersSenars.size() == 3);
        assertFalse(diesFeinersSenars.contains("Diumenge"));

        calculDies.addAll(diesSetmana);

        calculDies.clear();

        assertTrue(calculDies.isEmpty());

        calculDies.addAll(diesSetmana);

        calculDies.removeAll(diesCapDeSetmana);

        assertEquals(5,calculDies.size());

    }

    @Test
    public void provesAmbMapsTest() {
        Map<String,String> mapa = new java.util.HashMap<>();
        mapa.put("fons","vermell");
        mapa.put("menu","verd");
        mapa.put("taula","blau");

        assertEquals(3, mapa.size());
        assertTrue(mapa.containsKey("fons"));
        assertTrue(mapa.containsValue("vermell"));

        mapa.remove("fons");

        assertEquals(2, mapa.size());

        mapa.remove("ClauInexistent");

        assertEquals(2, mapa.size());

        assertEquals(mapa.get("menu"), "verd");


    }

    public void initDiesFeiners(List<String> dies) {
        dies.add("Dilluns");
        dies.add("Dimarts");
        dies.add("Dimecres");
        dies.add("Dijous");
        dies.add("Divendres");
    }

    @Test
    public void provesSetTest() {

        Set<String> dies = new HashSet<>();

        dies.add("Dilluns");
        dies.add("Dimarts");
        dies.add("Dimecres");
        dies.add("Dijous");
        dies.add("Divendres");

        assertEquals(5,dies.size());
    }
}
