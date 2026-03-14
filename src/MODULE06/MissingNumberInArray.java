package MODULE06;

public class MissingNumberInArray
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 4, 5, 6, 7};
        int n = 7;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing Number: " + missing);

    }
}
