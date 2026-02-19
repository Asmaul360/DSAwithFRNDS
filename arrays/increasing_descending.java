// Question:
// Rearrange the given array such that
// first half is in increasing order
// and second half is in decreasing order.

// Example:
// Input:  {10, 40, 30, 20, 50}
//
// Step 1: Sort the array
//         {10, 20, 30, 40, 50}
//
// Step 2: First half increasing
//         {10, 20, 30}
//
// Step 3: Second half decreasing
//         {50, 40}
//
// Output: {10, 20, 30, 50, 40}

package arrays;

public class increasing_descending {
    public static void main(String[] args) {

        int arr[] = {10, 40, 30, 20, 50};

        // Used selection sort

        // Step 1: Sort array in ascending order
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int mid = (arr.length + 1) / 2;
        int newArr[] = new int[arr.length];

        // Step 2: Copy first half (increasing)
        for(int i = 0; i < mid; i++){
            newArr[i] = arr[i];
        }

        // Step 3: Copy second half (decreasing)
        int index = mid;
        for(int i = arr.length - 1; i >= mid; i--){
            newArr[index] = arr[i];
            index++;
        }

        // Step 4: Print result
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
