package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverLoading {
    public static void main(String[] args) {
        int[] intArray = {-9,5,2,8};
        Arrays.sort(intArray);
        
        double[] doubleArray = {10.5, 23.5, 87,5};
        Arrays.sort(doubleArray);
        
        char[] charArrays = {'a', 'd', 'r', 'p'};
        Arrays.sort(charArrays);


        System.out.println("------------------------------------");
        
       int sum1 = sumOfNumbers(2, 5);
       double sum2 = sumOfNumbers(4.6, 4.8);
       int sum3 = sumOfNumbers(2, 4, 5);
       double sum4 = sumOfNumbers(3.9, 0.7, 3.6, 2.9);
       int sum5 = sumOfNumbers(4, 6, 7, 8);
       double sum6 = sumOfNumbers(10.5, 20.5, 30.5);
        
        
        
        
        
    }
    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }
    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers(int num1, int num2, int num3,int num4){
        return num1+num2+num3+num4;
    }
    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }
    public static double sumOfNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return sumOfNumbers(num1, num2, num3) + num4;
    }
}
