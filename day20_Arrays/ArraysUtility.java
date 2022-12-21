package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers = {10, 3, 5, 94,5,23};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // sorts array in ascending order
        System.out.println(Arrays.toString(numbers));


    }
}
