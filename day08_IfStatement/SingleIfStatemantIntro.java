package day08_IfStatement;

public class SingleIfStatemantIntro {
    public static void main(String[] args) {

        int number = 101;
/*
        System.out.println("Odd Number");

        System.out.println("Even Number");
*/

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = ! evenNumber;

        if (evenNumber) { //true
            System.out.println(number + " is even number");

        }

        if (!evenNumber) {   //not even number, odd number // false
            System.out.println(number + " is odd number");
        }

        System.out.println("-------------------------------");

        int n = 200;

        // positive
        if (n > 0) { // if n is greater than 0 then it is positive
            System.out.println(n + " is positive");
        }
        // negative

        if (n< 0){ // if n is less than zero, then it is negative
            System.out.println(n+ " is negative");
        }
        // zero
        if (n==0) {
            System.out.println(n + " is equal to zero");

        }
    }
}
