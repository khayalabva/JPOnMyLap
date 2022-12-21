package day15_ForLoop;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num = new Scanner(System.in).nextInt();
int result =1;
        for (int i = num; i >= 1; --i) {
            result *= i;
        }

        System.out.println(result);


    }
}
