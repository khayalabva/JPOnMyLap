package day26_CustomMethodsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {
        int[] r1 = {1,2,3};
        int[] r2 = {4,5,6,7};

        int[] r3 = merge(r1,r2);
        System.out.println(Arrays.toString(r3));
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int [arr1.length + arr2.length];

        int i = 0;

        for(int each : arr1){
            result[i++] = each;
        }
        for(int each : arr2){
            result[i++] = each;
        }
        return result;
    }
}
