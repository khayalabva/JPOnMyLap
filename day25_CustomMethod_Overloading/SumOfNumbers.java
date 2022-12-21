package day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum2 = sumOfNumbers(3,20);
        int sum3 = sumOf3Numbers(3,6,10);
        int sum4 = sumOf4Numbers(5,8,1,5);

        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);


    }
    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }
    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOf4Numbers(int num1, int num2, int num3,int num4){
        return num1+num2+num3+num4;
    }






}
/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */