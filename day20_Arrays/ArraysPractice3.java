package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int lenth= scan.nextInt(); //10

        if(lenth<=0){
            System.out.println("Invalid Entry");
            System.exit(0);
        }

        int[] num = new int [lenth];
        for (int i = 0; i < lenth; i++) {
            System.out.println("Enter a number");
            num[i]= scan.nextInt(); //each input user provided during each excecution of the loop, will be assigned

        }
        System.out.println(Arrays.toString(num));

    }
}
