/*
 Question:
 Write a Java program to calculate the sum of a Geometric Progression (GP).

 The program should:
 1. Take the number of elements (n) from the user.
 2. Take n elements of the array from the user.
 3. Assume the array forms a GP.
 4. Find the common ratio (r).
 5. Calculate and print the sum of the GP.
*/

package maths;

import java.util.Scanner;

public class geometricProgression {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of terms: ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter the elements of GP:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int a = arr[0];                 // first term
    int r = arr[1] / arr[0];        // common ratio

    double sum;

    if (r == 1) {
      sum = a * n;
    } else {
      sum = a * (1 - Math.pow(r, n)) / (1 - r);
    }

    System.out.println("Sum of GP = " + sum);

    sc.close();
  }
}
