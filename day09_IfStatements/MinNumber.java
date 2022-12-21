package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
 int n1 = 876;
 int n2 = 200;


 boolean n1isMin = n1 < n2;
 boolean n2isMin = n2 < n1;
 boolean equal = n1 == n2;

 /*if (n1< n2) {
            System.out.println(n1+ " is the minimum number");
        }
        */

        if(n1isMin) { // if n1 is the minimum number
            System.out.println(n1 + " is the minimum number");
        }
        if(n2isMin) { // if n12 is the minimum number
            System.out.println(n2 + " is the minimum number");
        }
        if(equal) { // if n1 is equal tp n2
            System.out.println("Equal");
        }

    }
}
/*
. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal

 */
