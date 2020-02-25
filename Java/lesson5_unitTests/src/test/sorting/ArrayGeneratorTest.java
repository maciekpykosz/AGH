package test.sorting;

import org.junit.Test;
import sorting.ArrayGenerator;

import static org.junit.Assert.*;

public class ArrayGeneratorTest {

    @Test
    public void shouldReturnOptimisticArray() {
        int[] result = ArrayGenerator.getOptimisticArray(5);
        int[] expected = {0,1,2,3,4};
        assertArrayEquals(expected,result);
    }

    @Test
    public void shouldReturnPessimisticArr() {
        int[] result = ArrayGenerator.getPessimisticArr(5);
        int[] expected = {5,4,3,2,1};
        assertArrayEquals(expected,result);
    }
}