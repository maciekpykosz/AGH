package test.sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sorting.algorithms.PigeonHoleSort;

import static org.junit.Assert.*;

public class PigeonHoleSortTest {
    private PigeonHoleSort pHS;

    @Before
    public void setUp(){
        pHS = new PigeonHoleSort();
    }

    @After
    public void tearDown(){

    }

    @Test
    public void shouldMyClassBeInitialized(){
        assertNotNull(pHS);
    }

    @Test
    //Stupid method but....
    public void isProperlySorted() {
        pHS = new PigeonHoleSort();
        int[] actual = {3,6,1,2,5,7,4};
        pHS.pigeonhole_sort(actual, 7);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected,actual);
    }
}