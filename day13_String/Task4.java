package day13_String;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String fName = scan.next();
        System.out.println("Enter your last name:");
        String lName = scan.next();

        char f = fName.charAt(0);
        char l = lName.charAt(0);

        System.out.println("Initials: " + f + "." + l);

    }
}
