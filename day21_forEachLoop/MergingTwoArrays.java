package day21_forEachLoop;

import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String[] args) {
        String[] group1 = {"Ali", "Wasta","Kemal"};
        String[] group2 = {"Osman", "Suat", "Valery","Maria"};

        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1){
            students[i++] = each;
        }

        for (String each : group2){
            students[i++] = each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("------------------------------------");

        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D','E'};

        char[] ch3 = new char[ch1.length+ch2.length];

        int j = 0;
        for (char each : ch1){
            ch3[j++] = each;
        }
        for (char each : ch2){
            ch3[j++] = each;
        }
        System.out.println(Arrays.toString(ch3));


    }
}