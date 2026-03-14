package MODULE08;

public class FindSetBits
{
    public static void main(String[] args)
    {
        int num = 19;
        int count = 0;

        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }

        System.out.println("Number of set bits in number is : " + count);

    }
}
