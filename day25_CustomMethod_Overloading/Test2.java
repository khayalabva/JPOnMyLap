package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {


    int[] arr1 = {1,2,3,4,5};

    ArraysUtility.printEachElement(arr1);


    int[] arr = {1,2,3,4,5};
    boolean x = ArraysUtility.contains(arr, 2);
        System.out.println(x);
}
}