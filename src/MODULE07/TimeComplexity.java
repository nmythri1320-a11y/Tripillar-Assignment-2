package MODULE07;

import java.util.Arrays;

public class TimeComplexity
{
    // Linear Search Method
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;   // element found
            }
        }
        return -1;  // element not found
    }

    // Binary Search Method
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args)
    {

        int arr[] = {5, 2, 9, 1, 7, 6, 3};
        int key = 7;

        // Linear Search
        int result1 = linearSearch(arr, key);
        if (result1 != -1)
            System.out.println("Linear Search: Element found at index " + result1);
        else
            System.out.println("Linear Search: Element not found");

        // Binary Search requires sorted array
        Arrays.sort(arr);

        int result2 = binarySearch(arr, key);
        if (result2 != -1)
            System.out.println("Binary Search: Element found at index " + result2);
        else
            System.out.println("Binary Search: Element not found");

    }
}
