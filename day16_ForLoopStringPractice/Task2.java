package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a string");
        String str = scan.nextLine();
      //  scan.nextLine();


        System.out.println("enter a char");
       char ch = scan.next().charAt(0);
       int frequency = 0;

        for (int i = 0; i < str.length(); i++) {   //indexes of each char
            char each = str.charAt(i);            //each char
            if (ch==each){
                frequency++;
            }

        }
        System.out.println("frequency = " + frequency);









       // scan.close();
    }
}
/*

2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */
