package test.excercise2;

import exercise2.TheSmallestPositiveValue;
import exercise2.exceptions.ListToLongException;
import exercise2.exceptions.ListValuesOutOfRange;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TheSmallestPositiveValueTest {
    private List<Integer> numbers;

    @Before
    public void setUp() {
        numbers = new ArrayList<>();
    }

    @Test
    public void shouldReturnTheSmallestValueWhenValuesInListArePositive() throws ListToLongException, ListValuesOutOfRange {
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        numbers.add(6);
        int result = TheSmallestPositiveValue.solution(numbers);
        assertEquals(2, result);
    }

    @Test
    public void shouldReturnTheSmallestValueWhenValuesInListAreNegative() throws ListToLongException, ListValuesOutOfRange {
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(-5);
        numbers.add(-6);
        numbers.add(-5);
        int result = TheSmallestPositiveValue.solution(numbers);
        assertEquals(-4, result);
    }

    @Test
    public void shouldReturnTheSmallestValueWhenValuesInListArePositiveAndNegative() throws ListToLongException, ListValuesOutOfRange {
        numbers.add(1);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(6);
        numbers.add(6);
        int result = TheSmallestPositiveValue.solution(numbers);
        assertEquals(-1, result);
    }
}