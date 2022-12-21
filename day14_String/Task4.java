package day14_String;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word 1:");
        String word1 = scan.next();

        System.out.println("Enter the word 2:");
        String word2 = scan.next();

        String str1 = word1.substring(word1.length()-1);
        String str2 = word2.substring(0,1);

        if(str1.equals(str2)){
            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }

    }
}
/*
Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
