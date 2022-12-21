package day19_LoopPractices;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
while(true) {
    System.out.println("Enter a number:");
    int num = scan.nextInt();

    if (num % 2 == 0) {
        System.out.println("Even Number");
    } else {
        System.out.println("Odd Number");
    }

    System.out.println("Would you like to add another number?");
    String a = scan.next();
    if (!(a.equalsIgnoreCase("no")|| a.equalsIgnoreCase("yes"))) {
        System.out.println("Invalid entry");
        System.exit(0);
    }
    if (a.equalsIgnoreCase("no")){
        System.out.println("Thank you for using Cydeo calculator!");
        break;
    }
}
    }
}
