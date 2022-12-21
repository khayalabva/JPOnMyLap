package day20_Arrays;

public class MinNumberFromArray {
    public static void main(String[] args) {
        int[] num = {28,98, 5, 9, 982,3};
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min){
                min = num[i];
            }

        }

        System.out.println(min);
    }
}
