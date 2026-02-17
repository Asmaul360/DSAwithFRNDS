// Write a Java program to calculate the power of a number.
// The program should take a number and its exponent (power) as input
// from the user and display the result.

package maths;
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the power: ");
        int power = in.nextInt();

        int solution = (int) Math.pow(num1, power);
        System.out.println("Result: " + solution);

        in.close();
    }
}
