package day27_WrapperClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
int[] arr1 = {1,2,3,4,5,6,7};
arr1 = replace(arr1, 3, 100);
        System.out.println(Arrays.toString(arr1));
    }
    
    //replaces the given element with
    public static int[] replace(int[] array, int index, int newElement){
        if(index>= array.length && index < 0){
            System.out.println("Invalid Index");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }
    //replaces the given element with
    public static double[] replace(double[] array, int index, double newElement){
        if(index>= array.length && index < 0){
            System.out.println("Invalid Index");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }

    //replaces the given element with
    public static char[] replace(char[] array, int index, char newElement){
        if(index>= array.length && index < 0){
            System.out.println("Invalid Index");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }
    //replaces the given element with
    public static String[] replace(String[] array, int index, String newElement){
        if(index>= array.length && index < 0){
            System.out.println("Invalid Index");
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }

}
/*
1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


		1.2 Create the same functions for double arrays, char arrays, and String arrays

 */
