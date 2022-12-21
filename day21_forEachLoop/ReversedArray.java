package day21_forEachLoop;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int[] reversed = new int [numbers.length]; //to make sure that array has enough capacity to contain all the elements of first array

        for (int i = numbers.length-1, j = 0; i >=0 ; i--,j++) {
            reversed[j] = numbers[i];
        }
            System.out.println(Arrays.toString(reversed));


    }
}
