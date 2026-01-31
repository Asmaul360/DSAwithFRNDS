// Q. Convert a Binary Number into its Decimal Equivalent.
//
// Example:
// Binary: 1011
// Step 1 → Read digits from right side
// Step 2 → Multiply each digit by powers of 2:
//          (1 × 2^0) = 1
//          (1 × 2^1) = 2
//          (0 × 2^2) = 0
//          (1 × 2^3) = 8
// Step 3 → Add all values:
//          8 + 0 + 2 + 1 = 11
// Final Answer: 1011 (binary) = 11 (decimal)

package numberSystem;
import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = in.nextInt();

    int count = 0;   // power of 2
    int sum = 0;     // value of each bit × power
    int add = 0;     // final decimal result

    while (num > 0) {    
      int a = num % 10;                    // extract last digit (0 or 1)
      sum = (int)Math.pow(2, count) * a;// convert bit to value
      add = add + sum;                    // add to final result
      num = num / 10;                    // remove last digit
      count++;                           // next power of 2
    }

    System.out.println(add);
    in.close();      
  }
}
