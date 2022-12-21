package day06_PrimitiveTypeCastings;

import org.w3c.dom.ls.LSOutput;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println(10+20); //30,   Addition
        System.out.println(100-50);  //50, Subtraction
        System.out.println(10*6);   //60, Multiplication


        System.out.println(100/3);  //33
        System.out.println(10/4); //2
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0);  //2.5
        System.out.println( 10d/4 );  //2.5


        int a = 100;
        double b = a/6;   //16.0
        double c = a/6.0; // 16.6666

        System.out.println(c);
        System.out.println(b);

        System.out.println(100D);

    }


}


/*
+: Addition
-: Subtract
*: Multiplication
/: Remainder


             intiger / intiger ====> integer
             decimal / decimal ====> decimal
             integer / decimal ====> decimal
             decimal /
                  in math:
                    10/4 = 2.5

                  in java:
                     10/4 = 2

 */