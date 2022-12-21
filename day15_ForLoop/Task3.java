package day15_ForLoop;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");

        int num = scan.nextInt();

        int result = 1;

        for (int i = (int) num ; i >=1; --i) {
            result += i;
        }
        System.out.println(result);

scan.close();
    }
}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */
