package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers;


    //public static Sheet sheet;

    public Circle(double radius){
        this.radius = radius;
       // pi = 3.14;
    }

    static{
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);

    }
}
