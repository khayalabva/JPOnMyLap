package day13_String;

import java.util.Scanner;

public class Task5_notCompleted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.next();
        int lenght = str.length();

       // int len = str.length();


        if (lenght==0){
            System.out.println("String is empty");
        }else if(lenght>3){
            System.out.println("" +str.indexOf(lenght-3)+ str.indexOf(lenght-2)+str.indexOf(lenght-1));

        }else{
            System.out.println(str);
        }
scan.close();

    }
}
/*

5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */
