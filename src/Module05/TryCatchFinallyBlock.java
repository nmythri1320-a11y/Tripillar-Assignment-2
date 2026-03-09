package Module05;

public class TryCatchFinallyBlock
{
    public static void main(String[] args)
    {
        try
        {
            int a = 20;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(" Exception Handled ");
        }
        finally{
            System.out.println(" Finally The Block Is Executing ");
        }
    }
}
