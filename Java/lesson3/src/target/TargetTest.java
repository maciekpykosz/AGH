package target;

public class TargetTest {
    public static void testSolution()
    {
        int[] arr = Target.solution(new int[]{19, 5, 25, 17, 4}, 30);
        for (int i : arr)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        testSolution();
    }
}
