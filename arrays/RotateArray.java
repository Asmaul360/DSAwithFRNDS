package arrays;

import java.util.Scanner;;
public class RotateArray {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);    
    System.out.println("Enter the size of the array : ");
    int size=in.nextInt();
    System.out.println("Enter the value of K");
    int k=in.nextInt();
    k = k % size;
    int arr[]=new int [size];
    System.out.println("Enter the elements in the array");
    for(int i=0;i<size;i++){
        arr[i]=in.nextInt();
    }
    int count=0;
    int newArr[]=new int[size];
    for(int i=k;i<arr.length;i++){
        newArr[count]=arr[i];
        count++;
    }
    for( int i=0;i<k;i++){
        newArr[count]=arr[i];
        count++;

    }
    System.out.println("The new array is : ");
    for(int i=0;i<newArr.length;i++){
        System.out.print(newArr[i] + " ");
    }
  }
  
}
