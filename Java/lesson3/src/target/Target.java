package target;

public class Target {
    public static int[] solution(int[] arr, float target)
    {
        int[] result = null;

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == target)
                {
                    result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

        if (result == null) {
            throw new IllegalArgumentException("given array with no solution");
        }

        return result;
    }
}
