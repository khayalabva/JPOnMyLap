package day27_WrapperClasses;
import utilities.ArraysUtility;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,1,2};

       // arr = removeDuplicates(arr);
        arr = ArraysUtility.addElement(arr,10);
        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");


        double [] r = {4.5,5.5,6.6};
        r = ArraysUtility.addElement(r,10.1);
        System.out.println(Arrays.toString(r));


        String[] y = {"mama", "jale", "muqam"};
        y = ArraysUtility.addElement(y, "papa");
        System.out.println(Arrays.toString(y));

    }




    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

}
