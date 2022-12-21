package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        double[] arr = {1.3, 2.5, 7.8, 11.9};

        double[] arr1 = ArraysUtility.reverse(arr);
        System.out.println(Arrays.toString(arr1));

    }
}
