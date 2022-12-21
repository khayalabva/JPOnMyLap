package day21_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int num = scan.nextInt();

        int[] inputs = new int [num];
        double sum = 0;

for(int each : inputs ){

            System.out.println("enter a number:");
            each = scan.nextInt();
            sum += each;
        }

        double average = sum/num;

        System.out.println(Arrays.toString(inputs));

        System.out.println("Average: " + average);
    }
}
