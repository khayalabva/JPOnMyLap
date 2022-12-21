package day14_String;
import java.util.Scanner;
public class Task8_Email2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
// kayala_bva@gmail.com
        System.out.println("Enter your email:");
        String email = scan.next();

        String fname = email.substring(0,email.indexOf("_"));
        String lname = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("First name = " + fname);
        System.out.println("Last name = " + lname);
        System.out.println("Domain = " + domain);

scan.close();


    }
}
/*
 Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

 */
