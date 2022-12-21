package day13_String;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the srings: ");

        String str = scan.next();
        if(str.length()==5){
            System.out.println(str);
        }else if(str.length()>5){
            System.out.println("Too long!");
        }else{
            System.out.println("Too short");
        }




    }
}
/*
Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */

