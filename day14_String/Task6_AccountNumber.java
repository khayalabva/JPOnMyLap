package day14_String;
import java.util.Scanner;
public class Task6_AccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter an account number");
        String num = scan.next();

        char begin = num.charAt(0);
        int lg = num.length();

        if (begin == '2'){
            if (lg==7){
                System.out.println("Account number is valid");
            }else{
                System.out.println("Not valid account number");
            }
        }else if(begin=='5'){
            if (lg==10){
                System.out.println("Account number is valid");
            }else{
                System.out.println("Not valid account number");
            }
        }else{
            System.out.println("Not valid account number");
        }


scan.close();
    }
}
/*
        Create a class called AccountNumber.
        Ask the user enter an account number (String). Check if these account number is valid.
                > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
        do not meet the expected results print “Invalid account number”
        */