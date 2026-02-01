package maths;
import java.util.Scanner;

/*
   QUESTION:
   Write a Java program to reverse a given integer using a while loop.
   The program should take an integer input from the user and print its reverse.
*/

public class reverse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking user to enter any number
        System.out.println("Enter a digit : ");
        int num = in.nextInt();

        int reverse = 0; // variable to store reversed number

        /*
            LOGIC TO REVERSE A NUMBER:
            1. Extract the last digit → digit = num % 10
            2. Add digit to reverse number → reverse = reverse * 10 + digit
            3. Remove the last digit → num = num / 10
            4. Repeat until num becomes 0
        */

        while (num > 0) {
            int digit = num % 10;          // Step 1: extract last digit
            reverse = reverse * 10 + digit; // Step 2: add to reverse
            num = num / 10;                 // Step 3: remove last digit
        }

        // Printing the reversed number
        System.out.println("The reverse of the number is : " + reverse);

        in.close();
    }
}
