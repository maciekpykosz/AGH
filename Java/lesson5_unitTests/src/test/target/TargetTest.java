package test.target;

import org.junit.Test;
import target.Target;

import static org.junit.Assert.*;

public class TargetTest {
    private int[] arr = {2,1,4,3,5,8,6,7,9};
    private int[] arr2 = {2,1,1,2,3,2,1,2,3};
    private int[] expected = {0,3};

    @Test
    public void testSolution() {
        int[] result = Target.solution(arr, 5);
        assertArrayEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrownExceptionWhenTargetIsImpossible(){
        Target.solution(arr2,8);
    }
}