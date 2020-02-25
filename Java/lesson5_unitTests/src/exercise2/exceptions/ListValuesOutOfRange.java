package exercise2.exceptions;

public class ListValuesOutOfRange extends Exception{
    public ListValuesOutOfRange()
    {
        super();
    }

    public ListValuesOutOfRange(String message)
    {
        super(message);
    }
}
