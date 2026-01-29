// Given an array of integers nums, return the second-largest element 
// in the array. If the second-largest element does not exist, return -1.

package arrays;
import java.util.Scanner;

public class SecondLargestEle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = -1;

        // Loop to find largest & second largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == -1) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
    }
}
