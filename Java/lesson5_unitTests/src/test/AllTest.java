package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.excercise2.TestsFromEx2;
import test.exercise3.TestsFromEx3;
import test.sorting.TestsFromSorting;
import test.target.TestsFromTarget;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestsFromEx2.class,
        TestsFromEx3.class,
        TestsFromSorting.class,
        TestsFromTarget.class

})
public class AllTest {
}