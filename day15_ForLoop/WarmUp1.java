package day15_ForLoop;
import java.util.Scanner;
public class WarmUp1 {
    public static void main(String[] args) {

        System.out.println("Enter the word");
        String word = new Scanner(System.in).next();  // we use when one scanner word is needed;

        if (word.charAt(0)== 'x'){
            System.out.println(word= word.replaceFirst("x","a"));
        }else{
            System.out.println(word);
        }





    }
}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */
