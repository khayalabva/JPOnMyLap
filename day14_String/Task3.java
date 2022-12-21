package day14_String;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word:");

        String word = scan.next();

        if(word.substring(0,1).equals("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }

        scan.close();


    }
}
/*
 3. Ask user to enter a word. If the word starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */