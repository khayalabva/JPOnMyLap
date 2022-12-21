package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray_Overloading {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5};
        numbers = addElement(numbers, 9);

        char[] chars = {'a', 'b', 'c', 'd'};
        chars = addElement(chars, 'x');

        String[] names = {"Cosmopolitan", "Blue Hawaian", "Mai Tai"};
        names = addElement(names, "Negroni");

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(names));
    }



    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length +1];

        int i = 0;
        for (int each: array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length +1];

        int i = 0;
        for (double each: array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    public static char[] addElement(char[] array, char element){
        char [] result = new char [array.length +1];

        int i = 0;
        for (char each: array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    public static String[] addElement(String[] array, String element){
        String [] result = new String [array.length +1];

        int i = 0;
        for (String each: array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

}
