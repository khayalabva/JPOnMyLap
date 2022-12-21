package day21_forEachLoop;

import java.util.Arrays;

public class Arraysutility2 {
    public static void main(String[] args) {

        String[] students ={"Elif","Sinem","Cihad","James","Daniel","Kaya","Osman"};
        String[] earlyBirtds = Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBirtds));

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        nums = Arrays.copyOf(nums,7);
        System.out.println(Arrays.toString(nums ));

        System.out.println("-----------------------------------------------");

        char[] ch1 = {'a','b','c','d','e','f','g','h'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6+1);
        System.out.println(Arrays.toString(ch2));

        System.out.println("-----------------------------------------------");

        int[] scores = {10,20,30,40,50,60,70,80,90};
        int[] result = Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));



    }
}
