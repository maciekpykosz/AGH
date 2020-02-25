package sorting;

import java.util.Random;

public class ArrayGenerator {
    public static int[] getOptimisticArray(int size)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = i;
        }
        return arr;
    }
    public static int[] getPessimisticArr(int size)
    {
        int[] arr = new int[size];

        int val = size;
        for (int i = 0; i < size; i++)
        {
            arr[i] = val;
            val--;
        }
        return arr;
    }
    public static int[] getRandomArr(int size)
    {
        Random random = new Random();


        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = random.nextInt(size);
        }
        return arr;
    }
}
