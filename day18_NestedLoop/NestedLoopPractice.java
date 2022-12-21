package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (age >= 1 && age <=120){
                System.out.println("Invalid Enter, Please re-enter");
                age = scan.nextInt();
            }
            System.out.println("would you like to continue?");
            String a = scan.next();

            while (!(a.equals("yes") || a.equals("no"))){
                System.out.println("Invalid entry,please re enter:");
                a=scan.next();
            }

            if(a.equals("no")){
                break;
            }
        }


        scan.close();

    }
}
