// Find all the prime numbers from the range
package maths;
import java.util.Scanner;
public class primeNumberInAGivenRange {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number 1 :");
    int num1=in.nextInt();
    System.out.println("Enter a number 2 :");
    int num2=in.nextInt();
    System.out.println("The all prime numbers are :");   
        for(int n = num1; n <= num2; n++){
    int flag = 0;

    if(n == 1) continue;

    for(int i = 2; i <= n/2; i++){
        if(n % i == 0){
            flag = 1;
            break;
        }
    }

    if(flag == 0){
        System.out.println(n);
    }
}
in.close();
    }
  }

