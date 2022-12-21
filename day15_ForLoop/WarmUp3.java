package day15_ForLoop;
import java.util.Scanner;
public class WarmUp3 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Nname: ");
        String firstName = scan.next();

        System.out.println("Enter the last name: ");
        String lastName = scan.next();

        String firstLetter1= firstName.substring(0,1).toUpperCase();
        String rest1 = firstName.substring(1).toLowerCase();

        String resultName = firstLetter1+rest1;

        String firstLetter2 = lastName.substring(0,1).toUpperCase();
        String rest2 = lastName.substring(1).toLowerCase();

        String resultSurName = firstLetter2+rest2;

        System.out.println(resultName+ " " + resultSurName);



    }
}
/*
 Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

        input:
        firstName = "cyDEo"
        lastName = "SCHOOL";

        output:
        Cydeo School
*/
