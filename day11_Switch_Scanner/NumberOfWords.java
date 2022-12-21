package day11_Switch_Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        /*
        Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary

         */

        int num = 5;
        String word = (num>=0 && num <=9)? (num==1)? "one":(num==2)? "two":(num==3)? "three":
                (num==4)? "four":(num==5)? "five":(num==6)? "six":(num==7)? "seven":(num==8)? "eight":
                        (num==9)? "nine": "zero": "invalid number";
        System.out.println(word);








    }
}
