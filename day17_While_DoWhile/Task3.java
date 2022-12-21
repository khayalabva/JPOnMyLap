package day17_While_DoWhile;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        int num1 = scan.nextInt();

        System.out.println("enter a number");
        int num2 = scan.nextInt();

        System.out.println("enter an operator");
        char operator =  scan.next().charAt(0);

        int result=0;

            while(!(operator=='+' || operator=='-' || operator=='*' || operator=='/')){
                System.out.println("Invalid operator, please re enter again");

                System.out.println("enter an operator");
                operator =  scan.next().charAt(0);

                if (operator=='+'){
                    result=num1 + num2;
                } else if (operator=='-') {
                    result=num1-num2;
                }else if(operator=='*'){
                    result= num1*num2;
                } else {
                    result = num1 / num2;
                }
            }
        System.out.println(result);
scan.close();
    }
}
/*
 write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */
