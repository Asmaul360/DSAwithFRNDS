package sorting;
import java.util.*;

// Quick Sort using RANDOM pivot selection
class Solution {

    // Partition function divides array around pivot
    public int partition(int[] arr, int low, int high) {

        // Pick a random position between low and high
        int randomIndex = low + new Random().nextInt(high - low + 1);

        // Swap random element with arr[low] → now arr[low] is pivot
        swap(arr, low, randomIndex);

        int pivot = arr[low];
        int i = low;
        int j = high;

        // Move i forward and j backward to place elements correctly
        while (i < j) {

            // Move i to the right until element > pivot
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            // Move j to the left until element < pivot
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            // Swap incorrect elements
            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Put pivot in its correct sorted position
        swap(arr, low, j);

        return j; // pivot index
    }

    // Recursive QuickSort
    public void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pIndex - 1);  // left side
            quickSortHelper(arr, pIndex + 1, high); // right side
        }
    }

    // QuickSort function used in main
    public int[] quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
        return nums;
    }

    // Swap function
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class Main {
    public static void main(String[] args) {

        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        // Simple for loop
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Solution solution = new Solution();
        int[] sortedArr = solution.quickSort(arr);

        System.out.println("After Sorting Array: ");
        // Simple for loop
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
    }
}
