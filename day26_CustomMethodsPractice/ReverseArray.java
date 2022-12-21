package day26_CustomMethodsPractice;

public class ReverseArray {

    //reverse the given array, returns a new array 
    public static int[] reverse(int[] array){
        int result[] = new int [array.length];

        for (int i = array.length-1, j = 0; i >=0; i--, j++) {
            result[i] = array[j];
        }
       return result; 
    }

    //reverse the given array, returns a new array 
    public static double[] reverse(double[] array){
        double result[] = new double [array.length];

        for (int i = array.length-1, j = 0; i >=0; i--, j++) {
            result[i] = array[j];
        }
        return result;
    }

    //reverse the given array, returns a new array 
    public static char[] reverse(char[] array){
        char result[] = new char [array.length];

        for (int i = array.length-1, j = 0; i >=0; i--, j++) {
            result[i] = array[j];
        }
        return result;
    }

    //reverse the given array, returns a new array 
    public static String[] reverse(String[] array){
        String result[] = new String [array.length];

        for (int i = array.length-1, j = 0; i >=0; i--, j++) {
            result[i] = array[j];
        }
        return result;
    }
    
}
