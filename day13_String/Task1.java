package day13_String;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter the sentence: ");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        String sentence = scan.nextLine();

        char firstCh = sentence.charAt(0);
        char lastCh = sentence.charAt(sentence.length()-1);

     System.out.println("first character: "+firstCh);
     System.out.println("last character:  " + lastCh);

scan.close();
    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */
