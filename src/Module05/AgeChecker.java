package Module05;

public class AgeChecker
{
    public static void main(String[] args)
    {
        int age = 17;
        if (age < 18)
        {
            throw new ArithmeticException("Not eligible");
        } else
        {
            System.out.println("Eligible to vote");
        }
    }
}
