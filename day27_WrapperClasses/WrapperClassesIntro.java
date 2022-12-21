package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1 = 100;
        Integer n1 = num1; //autoboxing
        int num2 = n1;    //unboxing

        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 =b1;

        System.out.println("------------------------------------------");

        int[] number = {1,2,3,4};
        Integer[] numbers = {2,3,4,5};

    }
}
