package day20_Arrays;

public class MaxNumFromArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 6, 20, 0};
        int max = numbers[0]; //10

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max) {   // if tehre is element in the array greater that the current max num
                max = numbers[i];
            }
        }
        System.out.println(max);


    }
}
