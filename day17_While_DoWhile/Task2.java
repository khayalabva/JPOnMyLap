package day17_While_DoWhile;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int result=0;

while (true){
    System.out.println("Enter a positive number");
    int num = scan.nextInt();
    result+=num;
    System.out.println("result = " + result);

    if (num<0){
        System.out.println("Error, number is negative");
        break;
    }

}
scan.close();
    }
}
/*
	2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */
