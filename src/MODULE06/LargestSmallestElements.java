package MODULE06;

public class LargestSmallestElements
{
    public static void main(String[] args)
    {
        int[] arr = {25,9,13,20,6,3 };

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                largest = arr[i];
            }

            if (arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }

        System.out.println("Largest Element is : " + largest);
        System.out.println("Smallest Element is : " + smallest);

    }
}
