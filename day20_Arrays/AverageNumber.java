package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class AverageNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int num = scan.nextInt();

        int[] inputs = new int [num];
        double sum = 0;

        for (int i = 0; i < inputs.length; i++) {
            System.out.println("enter a number:");
            inputs[i] = scan.nextInt();
            sum += inputs[i];
        }

        double average = sum/num;

        System.out.println(Arrays.toString(inputs));

        System.out.println("Average: " + average);
    }
}
/*
1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */
