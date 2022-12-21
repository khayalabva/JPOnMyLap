package day15_ForLoop;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your input:");
        String input = scan.next();

        String letters = "",
                digits ="",
                specialCharacters="";
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if(ch >='0' && ch<='9'){
                digits += ch;
            } else if (ch>='a'&& ch<= 'z') {
                letters+=ch;

            }else if (ch>='A'&& ch<= 'Z') {
                letters+=ch;

            }else{
                specialCharacters+=ch;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);
    }


}
/*
. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */