package day10_NestedIf;

public class BiggerNum {
    public static void main(String[] args) {
        /*
         Create a class called BiggerNum, write a program that checks for bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is the biggest output: "n1 is bigger"
            if n2 is the biggest output: "n2 is bigger"
            if n3 is the biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
         */

        int n1= 76;
        int n2 =36;
        int n3= 901;

        String result= (n1>n2 && n1>n3)? "n1 is bigger":(n2>n1 && n2>n3)? "n2 is bigger": "n3 is bigger";
        System.out.println(result);








    }
}
