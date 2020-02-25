package test.sorting;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import sorting.algorithms.HeapSort;

public class HeapSortTest {
    private HeapSort hS;

    @Before
    public void setUp(){
        hS = new HeapSort();
    }

    @After
    public void tearDown(){

    }

    @Test
    public void shouldMyClassBeInitialized(){
        assertNotNull(hS);
    }

    @Test
    //Stupid method but....
    public void isProperlySorted() {
        hS = new HeapSort();
        int[] actual = {3,6,1,2,5,7,4};
        hS.sort(actual);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected,actual);
    }
}