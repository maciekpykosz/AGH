package exercise3;

public class SubstringTest {
    private final static Substring substring = new Substring();

    public static void test1Ex()
    {
        System.out.println(substring.substring("abcd", "cdabcdab"));
        //returned value should be equal to 3
    }

    public static void test2()
    {
        System.out.println(substring.substring("abcd", "bcdabcdabcdab"));
        //returned value should be equal to 4
    }


    public static void test3()
    {
        System.out.println(substring.substring("abcd", "abcd"));
        //returned value should be equal to 1
    }

    public static void test4()
    {
        System.out.println(substring.substring("abcd", "abc"));
        //returned value should be equal to -1
    }

    public static void test5()
    {
        System.out.println(substring.substring("abcd", "abcda"));
        //returned value should be equal to 2
    }

    public static void test6()
    {
        System.out.println(substring.substring("abcd", "dabcd"));
        //returned value should be equal to 2
    }

    public static void main(String[] args)
    {
        test1Ex();
        test2();
        test3();
        test4();
        test5();
        test6();
    }
}
