package sorting;

import sorting.algorithms.*;

public class SpeedTester {
    private final BubbleSort bubbleSort;
    private final IterativeMergeSort iterativeMergeSort;
    private final MergeSort mergeSort;
    private final PigeonHoleSort pigeonHoleSort;
    private final HeapSort heapSort;

    private final int ARR_SIZE;

    private final int[] optArr;
    private final int[] pesArr;
    private final int[] realArr;

    public SpeedTester(int arrSize)
    {
        bubbleSort = new BubbleSort();
        iterativeMergeSort = new IterativeMergeSort();
        mergeSort = new MergeSort();
        pigeonHoleSort = new PigeonHoleSort();
        heapSort = new HeapSort();

        ARR_SIZE = arrSize;

        optArr = ArrayGenerator.getOptimisticArray(ARR_SIZE);
        pesArr = ArrayGenerator.getPessimisticArr(ARR_SIZE);
        realArr = ArrayGenerator.getRandomArr(ARR_SIZE);
    }

    public void testBubbleSort()
    {
        int[] testOptArr = optArr.clone();

        long tStart = System.currentTimeMillis();
        bubbleSort.bubbleSort(testOptArr);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;

        System.out.println("###bubble sort OPTIMISTIC time: " + elapsedSeconds);

        int[] testPesArr = pesArr.clone();

        tStart = System.currentTimeMillis();
        bubbleSort.bubbleSort(testPesArr);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;

        System.out.println("###bubble sort PESIMISTIC time: " + elapsedSeconds);


        int[] testRealArr = realArr.clone();

        tStart = System.currentTimeMillis();
        bubbleSort.bubbleSort(testRealArr);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;

        System.out.println("###bubble sort Realistic time: " + elapsedSeconds);
        System.out.println("====================================");
    }

    public void testIterativeMergeSort()
    {
        int[] testOptArr = optArr.clone();

        long tStart = System.currentTimeMillis();
        iterativeMergeSort.mergeSort(testOptArr);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;

        System.out.println("###iterative Merge sort OPTIMISTIC time: " + elapsedSeconds);

        int[] testPesArr = pesArr.clone();

        tStart = System.currentTimeMillis();
        iterativeMergeSort.mergeSort(testPesArr);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;

        System.out.println("###iterative Merge sort PESIMISTIC time: " + elapsedSeconds);

        int[] testRealArr = realArr.clone();

        tStart = System.currentTimeMillis();
        iterativeMergeSort.mergeSort(testRealArr);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;

        System.out.println("###iterative Merge sort Real time: " + elapsedSeconds);
        System.out.println("====================================");
    }

    public void testRecursiveMergeSort()
    {
        int[] testOptArr = optArr.clone();

        long tStart = System.currentTimeMillis();
        mergeSort.sort(testOptArr, 0, testOptArr.length - 1);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;

        System.out.println("###Recursive Merge sort OPTIMISTIC time: " + elapsedSeconds);

        int[] testPesArr = pesArr.clone();

        tStart = System.currentTimeMillis();
        mergeSort.sort(testPesArr, 0, testPesArr.length - 1);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;

        System.out.println("###Recursive Merge sort PESSIMISTIC time: " + elapsedSeconds);

        int[] testRealArr = realArr.clone();

        tStart = System.currentTimeMillis();
        mergeSort.sort(testRealArr, 0, testRealArr.length - 1);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;

        System.out.println("###Recursive Merge sort Realistic time: " + elapsedSeconds);
        System.out.println("====================================");
    }

    public void testPigeonHole()
    {
        int[] testOptArr = optArr.clone();

        long tStart = System.currentTimeMillis();
        pigeonHoleSort.pigeonhole_sort(testOptArr, testOptArr.length);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("###Pigeon Hole  sort OPTIMISTIC time: " + elapsedSeconds);

        int[] testPesArr = pesArr.clone();

        tStart = System.currentTimeMillis();
        pigeonHoleSort.pigeonhole_sort(testPesArr, testPesArr.length);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("###Pigeon Hole  sort PESSIMISTIC time: " + elapsedSeconds);

        int[] testRealArr = realArr.clone();

        tStart = System.currentTimeMillis();
        pigeonHoleSort.pigeonhole_sort(testRealArr, testRealArr.length);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("###Pigeon Hole  sort Real time: " + elapsedSeconds);

        System.out.println("====================================");
    }

    public void testHeapSort()
    {
        int[] testOptArr = optArr.clone();

        long tStart = System.currentTimeMillis();
        heapSort.sort(optArr);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("###Heap Sort   OPTIMISTIC time: " + elapsedSeconds);

        int[] testPes = pesArr.clone();

        tStart = System.currentTimeMillis();
        heapSort.sort(pesArr);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("###Heap Sort   Pessimistic time: " + elapsedSeconds);

        int[] testReal = realArr.clone();

        tStart = System.currentTimeMillis();
        heapSort.sort(testReal);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("###Heap Sort   realistic time: " + elapsedSeconds);
    }

    public static void main(String[] args)
    {
        SpeedTester speedTester = new SpeedTester(1000000);
        //speedTester.testBubbleSort();
        speedTester.testIterativeMergeSort();
        speedTester.testRecursiveMergeSort();
        speedTester.testPigeonHole();
        speedTester.testHeapSort();

    }
}
