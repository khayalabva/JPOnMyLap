package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        // 123Enter

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();  //Enter

        System.out.println("Enter your Programming Language: ");
        String programming = input.nextLine();  //Enter

        System.out.println("Enter your age: ");
        int age = input.nextInt();     //24Enter

        input.nextLine();    // takes out the enter key user pressed for nextInt()

        System.out.println("Enter your School Name: ");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);


input.close();

    }
}
