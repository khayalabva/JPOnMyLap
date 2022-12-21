package day13_String;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:" );
        String st1 = scan.nextLine();

        System.out.println("Enter the second string: ");
        String st2 = scan.nextLine();

        if (st1.length()> st2.length()){
            System.out.println("st1");
        }else{
            System.out.println(st2);
        }




    }
}
// write a program that asks user to enter two strings, and print out the longest string
