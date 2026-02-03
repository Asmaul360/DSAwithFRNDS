// QUESTION:
// Write a Java program to sort an array using Selection Sort.
// Example: Input = [29, 10, 14, 37, 13]
// Output = [10, 13, 14, 29, 37]
package sorting;

public class SelectionSort {

    // Function to perform Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop for each position of the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  // Assume current index has the minimum

            // Find minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with arr[i]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13}; // Example array

        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {     // normal for-loop
            System.out.print(arr[i] + " ");
        }

        // Call selection sort
        selectionSort(arr);

        System.out.println("\nSorted Array:");
        for (int i = 0; i < arr.length; i++) {     // normal for-loop
            System.out.print(arr[i] + " ");
        }
    }
}
