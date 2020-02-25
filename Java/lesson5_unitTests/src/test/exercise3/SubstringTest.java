package test.exercise3;

import exercise3.Substring;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SubstringTest {
    private Substring sub;

    @Before
    public void setUp() {
        sub = new Substring();
    }

    @Test
    public void testSubstring() {
        String firstString = "abc";
        String secondString = "abcabcabc";
        int result = sub.substring(firstString, secondString);
        assertThat(result, is(3));
    }
}