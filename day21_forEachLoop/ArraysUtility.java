package day21_forEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};

        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------");

        int[] scores = {34,56,87,12,45,85};
        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("-----------------------------------");

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,3,2};

        Arrays.sort(arr2);
        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);

        System.out.println("-----------------------------------------");

        char[] ch1 = {'a','b','c'};
        char[] ch2 = {'a','c','b'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean r2 = Arrays.equals(ch1,ch1);
        System.out.println("anagram: " +r2);



}
}