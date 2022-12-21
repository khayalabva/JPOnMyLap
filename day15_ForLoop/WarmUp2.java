package day15_ForLoop;

import java.util.Scanner;
import java.util.Scanner;
public class WarmUp2 {
    public static void main(String[] args) {

        System.out.println("Enter the word");
        String word = new Scanner(System.in).next();  // we use when one scanner word is needed;


       String word1 = word.replace("x", "a");
       String word2 = word1.replace("X", "a");
        System.out.println(word2);


    }
}
/*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */
