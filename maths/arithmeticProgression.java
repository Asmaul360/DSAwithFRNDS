/*
 Question:
 Write a Java program to find the sum of an Arithmetic Progression (AP).

 The user will enter:
 - First term (a)
 - Common difference (d)
 - Number of terms (n)

 Find the sum using the formula:
 S = n/2 × [2a + (n-1)d]
*/

package maths;

import java.util.Scanner;

public class arithmeticProgression {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first term (a): ");
    int a = sc.nextInt();

    System.out.print("Enter common difference (d): ");
    int d = sc.nextInt();

    System.out.print("Enter number of terms (n): ");
    int n = sc.nextInt();

    int sum = n * (2 * a + (n - 1) * d) / 2;

    System.out.println("Sum of AP = " + sum);

    sc.close();
  }
}
