package MODULE06;

public class SumOfElements
{
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 8};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];     // or we can use {sum = sum + arr[i];}
        }

        System.out.println("Sum of all elements in the array is : " + sum);

    }
}
