package day09_IfStatements;

public class NumberToWord {
    public static void main(String[] args) {
        int num=1;
        if( num >=0 && num <=9) {
            if (num == 1) {
                System.out.println("one");
            } else if (num == 2) {
                System.out.println("two");
            } else if (num == 3) {
                System.out.println("three");
            } else if (num == 4) {
                System.out.println("four");
            } else if (num == 5) {
                System.out.println("five");
            } else if (num == 6) {
                System.out.println("six");
            } else if (num == 7) {
                System.out.println("seven");
            } else if (num == 8) {
                System.out.println("eight");
            } else if (num == 9) {
                System.out.println("nine");
            } else {
                System.out.println("zero");
            }
        }else{
                System.out.println("non valid number");
            }






    }
}
/*
1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */
