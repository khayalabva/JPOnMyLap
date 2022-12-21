package day14_String;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word:");
        String word = scan.next();

        String result= word.substring(word.length()-2);

        if (result.equals("ly")){
            System.out.println("Really?");
        }else{
            System.out.println("Never mind");
        }
        scan.close();



    }
}
/*
ask the user to enter a word. if the word ends with "ly", print "really???" ,
otherwise, print "never mind"
 */
