package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        system.out.println("Enter true or false: ");
        boolean result = input.nextBoolean();
         */

        System.out.println("Enter your name: ");
        String name = input.next(); //Java Programming
                                    // reads the input until a space

        System.out.println("name = " + name);



        input.close();



    }
}
