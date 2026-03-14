package MODULE08;

import java.util.Arrays;

public class CheckAnagram
{
    public static void main(String[] args)
    {
        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println(" This is Anagram String...");
        else
            System.out.println(" This is Not Anagram String");

    }
}
