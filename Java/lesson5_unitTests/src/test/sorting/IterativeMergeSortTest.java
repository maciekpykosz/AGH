package test.sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sorting.algorithms.IterativeMergeSort;

import static org.junit.Assert.*;

public class IterativeMergeSortTest {
    private IterativeMergeSort iMS;

    @Before
    public void setUp(){
        iMS = new IterativeMergeSort();
    }

    @After
    public void tearDown(){

    }

    @Test
    public void shouldMyClassBeInitialized(){
        assertNotNull(iMS);
    }

    @Test
    //Stupid method but....
    public void isProperlySorted() {
        iMS = new IterativeMergeSort();
        int[] actual = {3,6,1,2,5,7,4};
        iMS.mergeSort(actual);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected,actual);
    }
}