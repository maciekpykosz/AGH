package test.sorting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BubbleSortTest.class,
        HeapSortTest.class,
        MargeSortTest.class,
        IterativeMergeSortTest.class,
        PigeonHoleSortTest.class,
        ArrayGeneratorTest.class
})
public class TestsFromSorting {
}
