package day22_MultidimentionalArray;

import java.util.Arrays;

public class MultidimentionalArraysIntro {
    public static void main(String[] args) {

        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Aeron", "Sansa", "Bran"};
        String[] group3 = {"Harry", "Ron", "James"};

        String[][] groups = new String [3][]; //index 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

      //  System.out.println(Arrays.toString(groups)); //toString method is for one dimensional array only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("---------------------------------------");

        /*
            {1,2,3}
            {4,5,6,7}
            {8,9,10,11,12}
         */

int[][] nums = { {1,2,3}, {4,5,6,7},{8,9,10,11,12} };
        System.out.println(Arrays.deepToString(nums));

        System.out.println(Arrays.toString(nums[1]));
        System.out.println(nums[2][3]);


    }
}
/*
String[] group1 = {"Jon", "Joes", "James"}
String[] group2 = {"Jon", "Joes", "James"}
String[] group3 = {"Jon", "Joes", "James"}
 */
