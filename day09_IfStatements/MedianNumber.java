package day09_IfStatements;

import java.sql.SQLOutput;

public class MedianNumber {
    public static void main(String[] args) {

            int a = 67,
                b = 86,
                c = 83;

        boolean aIsMed = (b < a && a < c) || ( c < a && a < b);
        boolean bIsMed = (a < b && b < c) || ( c < b && b < a);
        boolean cIsMed = (a < c && c < b) || ( b < c && c < a);
        // boolean cIsMed = !aIsMed && !bIsMed;


if (aIsMed) {
    System.out.println(a + " is a Median Number");
}
if (bIsMed) {
    System.out.println(b + " is a Median Number");
        }
if (cIsMed) {
    System.out.println(c + " is a Median Number");
        }



    }
}
/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

 */
