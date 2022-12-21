package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result;

        System.out.println("enter a number");
        int num1 = scan.nextInt();

        System.out.println("enter a math operator");
        char operator = scan.next().charAt(0);

        if (!(operator == '+' || operator=='-')){
            System.out.println("invalid math operator: "+ operator);
            System.exit(0);
        }

        System.out.println("enter a number");
        int num2 = scan.nextInt();

        if (operator=='+'){
            result= num1+num2;
        }else{
            result= num1-num2;
        }

        System.out.print("Result: " + result);




    }
}
