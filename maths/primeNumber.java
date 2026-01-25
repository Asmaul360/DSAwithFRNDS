
/*
  QUESTION:
  Write a Java program to check whether a given number is a Prime Number.

  LOGIC OF PRIME NUMBER:
  - A prime number is a number that has only TWO factors:
       1 and the number itself.
  - So we check whether the number is divisible by any value from 2 to (num-1).
  - If we find any divisor, the number is NOT prime.
  - If no divisor is found, the number is PRIME.
*/
package maths;
import java.util.Scanner;

public class primeNumber {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Enter a number :");
    int num = in.nextInt();

    int count = 0;     // to check if any divisor is found

    // Checking from 2 to num-1
    for (int i = 2; i < num; i++) {

      // If num is divisible by i → not prime
      if (num % i == 0) {
        count++;       // divisor found
        break;         // no need to check further
      }
    }

    // Final decision
    if (count > 0) {
      System.out.println("Not Prime Number");
    } else {
      System.out.println("Prime Number");
    }

    in.close();
  }
}
