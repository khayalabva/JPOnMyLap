package day23_CustomMethods_Void;

import java.time.Year;

public class AgeOfThePerson {
    public static void main(String[] args) {
        ageOfPerson(1996);
        printNumbers(2,18);
    }

    public static void ageOfPerson(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("Your age is: "+ age);
    }
    public static void printNumbers(int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.println(i);

        }
    }
}
