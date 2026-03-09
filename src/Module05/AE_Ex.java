package Module05;

public class AE_Ex
{
    public static void main(String[] args)
    {
        try
        {
            int a = 13;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println(" ArithmeticException Have Occured");
        }
    }
}
