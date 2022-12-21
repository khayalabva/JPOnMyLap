package day13_String;
import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next(); // "java

        System.out.println("Enter your last name");
        String lastnName = scan.next();

        char f = firstName.charAt(0);
        char l = lastnName.charAt(0);

        String initial = f+"."+l;
        System.out.println("Initial: " + initial);


    }
}
