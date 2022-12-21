package day23_CustomMethods_Void;

import day09_IfStatements.EligibleToBuyAlcohol;

public class PracticeTasks {
    public static void main(String[] args) {
        OddNumbers();
        System.out.println();
        System.out.println("---");
        EvenNumbers();
        System.out.println();
        System.out.println("---");
        EligibleToBuyAlcohol(15);


    }

    public static void OddNumbers(){
        for (int i = 1; i < 101; i++) {
            if(i%2==1) {
                System.out.print(i + " ");
            }
        }
    }
    public static void EvenNumbers(){
        for (int i = 1; i < 101; i++) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void EligibleToBuyAlcohol(int age){
        if(age<1 & age>120){
            System.out.println("Invalid Entry");
        }else if(age>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }

}
/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space

	2. create a method that can print even numbers between 1~100 in a same line saperated by space

	3. create a method that can check if a person is eligible to buy alcohol

 */
