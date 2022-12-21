package day12_Scanner;
import java.util.Scanner;
public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);     //Enter

        System.out.println("Enter your age: ");
        int age = input.nextInt();                   //19

        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your name: ");
        String fullName = input.nextLine();           //Enter

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);


input.close();

    }
}
/*
ask user to enter age       (nextInt() )
ask user to enter full name (nextLine() )
 */
