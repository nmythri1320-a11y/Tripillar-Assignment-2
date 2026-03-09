package String_Manipulation;

public class StringImmutable
{
    public static void main(String[] args)
    {
        String s = " Electrical And Electronics ";
        s.concat( " Engineering ");
        System.out.println(s);
        s = s.concat("Engineering ");
        System.out.println(s);

    }
}
