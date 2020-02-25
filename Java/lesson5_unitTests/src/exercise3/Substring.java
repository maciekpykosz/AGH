package exercise3;

public class Substring {

    public int checkIncompletePrefix(String incomplete, String a)
    {
        if (incomplete.isEmpty())
            return 0;

        int j = a.length() - 1;
        for (int i = incomplete.length() - 1; i >= 0; i--, j--)
        {
            if (incomplete.charAt(i) != a.charAt(j))
                return -1;
        }

        return 1;
    }

    public int checkIncompletePostfix(String incomplete, String a)
    {
        if (incomplete.isEmpty())
            return 0;

        int j = 0;
        for (int i = 0; i < incomplete.length(); i++, j++)
        {
            if (incomplete.charAt(i) != a.charAt(j))
                return -1;
        }

        return 1;
    }

    public int substring(String a, String b)
    {
        if (!b.contains(a))
            return -1;

        final int lengthOfA = a.length();
        int counter;

        int foundAtIndex = b.indexOf(a);
        String sentenceBeforeFirstOccurrence = b.substring(0, foundAtIndex);
        int returned = checkIncompletePrefix(sentenceBeforeFirstOccurrence, a);
        if (returned == -1)
            return -1;
        else
            counter = returned;


        int tmp =-1;
        while (foundAtIndex != -1)
        {
            tmp=foundAtIndex;
            foundAtIndex = b.indexOf(a, foundAtIndex + lengthOfA - 1);
            counter++;
        }


        String sentenceAfterLastOccurrence = b.substring(tmp+ lengthOfA);
        returned=checkIncompletePostfix(sentenceAfterLastOccurrence, a);

        if (returned == -1)
            return -1;
        else
            counter =counter+ returned;


        return counter;
    }
}
