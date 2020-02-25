package exercise2;

import exercise2.exceptions.ListToLongException;
import exercise2.exceptions.ListValuesOutOfRange;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TheSmallestPositiveValueTest {
    public static void main(String[] args) throws ListToLongException, ListValuesOutOfRange
    {
        test1();
        test2();
        test3RandomNum();
        test4RandomNum();
    }

    public static void test1() throws ListToLongException, ListValuesOutOfRange
    {
        final List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        System.out.println("SOLUTION:  " + TheSmallestPositiveValue.solution(numbers));
        for (int n : numbers)
            System.out.println(n);
    }

    public static void test2() throws ListToLongException, ListValuesOutOfRange
    {
        final List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(-3);
        numbers.add(-12);
        numbers.add(-35);
        numbers.add(-15);
        numbers.add(-3);
        System.out.println("SOLUTION:  " + TheSmallestPositiveValue.solution(numbers));
        for (int n : numbers)
            System.out.println(n);
    }

    public static void test3RandomNum() throws ListToLongException, ListValuesOutOfRange
    {
        Random rand = new Random();
        final List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++)
        {
            int n = rand.nextInt(100) + 1;
            numbers.add(n);
        }

        System.out.println("SOLUTION:  " + TheSmallestPositiveValue.solution(numbers));
        for (int n : numbers)
            System.out.println(n);
    }

    public static void test4RandomNum() throws ListToLongException, ListValuesOutOfRange
    {
        Random rand = new Random();
        final List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++)
        {
            int n = -rand.nextInt(100) + 1;
            numbers.add(n);
        }

        System.out.println("SOLUTION:  " + TheSmallestPositiveValue.solution(numbers));
        for (int n : numbers)
            System.out.println(n);
    }
}

