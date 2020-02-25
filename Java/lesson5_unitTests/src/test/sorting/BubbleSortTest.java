package test.sorting;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import sorting.algorithms.BubbleSort;

import static org.junit.Assert.*;

public class BubbleSortTest {
    private BubbleSort bS;

    @Before
    public void setUp(){
        bS = new BubbleSort();
    }

    @Test
    public void shouldMyClassBeInitialized(){
        assertNotNull(bS);
    }

    @Test
        //Stupid method but....
    public void isProperlySorted() {
        bS = new BubbleSort();
        int[] actual = {3,6,1,2,5,7,4};
        bS.bubbleSort(actual);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected,actual);
    }
}