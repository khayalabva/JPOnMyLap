package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number: ");
int positive =0;
int negative = 0;
      for (int i = 1; i <= 5 ; i++) {   //number of times when we can enter the number
        int num = scan.nextInt();
if (num>0){
  positive++;
}
if (num<0){
  negative++;
}
      }
      System.out.println(positive + " positive and "+negative+" negative numbers");

    /*    System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scan.nextInt();

        System.out.println("Enter the forth number: ");
        int num4 = scan.nextInt();

        System.out.println("Enter the fifth number: ");
        int num5 = scan.nextInt();
*/




    }
}
/*
Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */