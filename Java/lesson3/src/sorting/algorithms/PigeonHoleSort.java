package sorting.algorithms;

import java.util.Arrays;

public class PigeonHoleSort
{
    public void pigeonhole_sort(int arr[],
                                int n)
    {
        int min = arr[0];
        int max = arr[0];
        int range, i, j, index;

        for (int a = 0; a < n; a++)
        {
            if (arr[a] > max)
                max = arr[a];
            if (arr[a] < min)
                min = arr[a];
        }

        range = max - min + 1;
        int[] pHole = new int[range];
        Arrays.fill(pHole, 0);

        for (i = 0; i < n; i++)
            pHole[arr[i] - min]++;


        index = 0;

        for (j = 0; j < range; j++)
            while (pHole[j]-- > 0)
                arr[index++] = j + min;
    }
}
