package test.sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sorting.algorithms.MergeSort;

import static org.junit.Assert.*;

public class MargeSortTest {
    private MergeSort mS;

    @Before
    public void setUp(){
        mS = new MergeSort();
    }

    @After
    public void tearDown(){

    }

    @Test
    public void shouldMyClassBeInitialized(){
        assertNotNull(mS);
    }

    @Test
    //Stupid method but....
    public void isProperlySorted() {
        mS = new MergeSort();
        int[] actual = {3,6,1,2,5,7,4};
        mS.sort(actual, 0,6);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected,actual);
    }
}
