package numberSystem;
import java.util.Scanner;
public class BinaryToDecimal {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num=in.nextInt();
    int count=0;
    int sum=0;
    int add=0;
    while(num>0){    
      int a=num%10;
      sum=(int)Math.pow (2, count)*a;
      add=add+sum;
      num=num/10;
      count++;
    }
    System.out.println(add);
    in.close();      

  }
}
