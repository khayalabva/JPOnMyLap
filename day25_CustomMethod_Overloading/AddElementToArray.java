package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7};
        arr = addInteger(arr, 8);
        System.out.println(Arrays.toString(arr));

        double[] arr1 = {2.5 , 2.7 , 9.4};
        arr1 = addDouble(arr1, 5.8);
        System.out.println(Arrays.toString(arr1));

        char[] arr2 = {'a', 'b', 'o', 'r'};
        arr2 = addChar(arr2, 'f');
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = {"Lola", "Stefano", "Iqor", "Java"};
        arr3 = addString(arr3, "Washington");
        System.out.println(Arrays.toString(arr3));

    }
    public static int[] addInteger(int[] array, int element){
        int[] result = new int[array.length +1];

        int i = 0;
        for (int each: array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    public static double[] addDouble(double[] array, double element){
        double[] result = new double[array.length +1];

        int i = 0;
        for (double each: array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    public static char[] addChar(char[] array, char element){
        char [] result = new char [array.length +1];

        int i = 0;
        for (char each: array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    public static String[] addString(String[] array, String element){
        String [] result = new String [array.length +1];

        int i = 0;
        for (String each: array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
}
