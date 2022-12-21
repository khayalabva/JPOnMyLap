package day14_String;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String word1 = scan.next();

        System.out.println("Enter the second word:");
        String word2 = scan.next();

        String result1 = word1.substring(1);
        String result2 = word2.substring(1);
        System.out.println(result1+result2);



scan.close();

    }
}
