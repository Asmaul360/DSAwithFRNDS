/*
Question:
Write a Java program to calculate the area of a circle.
The program should take the radius as input from the user and compute the area.

Formula:
Area = π × r × r

Example:
Input:
Radius = 5
Calculation:
Area = 3.17 × 5 × 5 = 79.25
Output:
The area of circle is: 79.25
*/

package maths;
import java.util.Scanner;

public class areaOfCircle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the value of radius : ");
    int r = in.nextInt();

    double pie = 3.17;
    double circle = pie * (r * r); 

    System.out.println("The area of circle is : " + circle);

    in.close();
  }
}
