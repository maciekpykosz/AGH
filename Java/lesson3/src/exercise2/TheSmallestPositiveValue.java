package exercise2;

import exercise2.exceptions.ListToLongException;
import exercise2.exceptions.ListValuesOutOfRange;

import java.util.Comparator;
import java.util.List;

public class TheSmallestPositiveValue {

    private static boolean checkList(List<Integer> numbers) throws ListToLongException,ListValuesOutOfRange
    {
        if (!(numbers.size() < 10000))
        {
            throw new ListToLongException("given list is to long: " + numbers.toString());
        }
        else if (numbers.get(0) < -1000000)
        {
            throw new ListValuesOutOfRange("given list's argument of index: " + 0 +" is  smaller than -100000");
        }
        else if (numbers.get(numbers.size() - 1) > 1000000)
        {
            throw new ListValuesOutOfRange("given list's argument of index: " + (numbers.size() - 1) +" is  bigger than 100000");
        }
        return true;
    }

    public static int solution(List<Integer> numbers) throws ListToLongException, ListValuesOutOfRange
    {
        numbers.sort(Comparator.naturalOrder());

        TheSmallestPositiveValue.checkList(numbers);


        boolean growing = true;
        int result = Integer.MIN_VALUE;

        for (int i = 1; i < numbers.size(); i++)
        {
            int diff = numbers.get(i) - numbers.get(i - 1);
            if (diff > 1)
            {
                result = numbers.get(i - 1) + 1;
                growing = false;
                break;
            }
        }

        if (growing)
        {
            result = numbers.get(numbers.size() - 1) + 1;
        }

        if (result <= 0)
        {
            result = 1;
        }

        return result;
    }
}
