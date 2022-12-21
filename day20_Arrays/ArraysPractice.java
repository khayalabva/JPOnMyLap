package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        // store teh elements: 10,20,50,70

        int[] teh ={10,20,50,70}; //size:4
        System.out.println(Arrays.toString(teh));

        System.out.println("--------------------------------------");

        //variable that can cotain 5 scores
        int[] scores = new int[5];
        scores[1]= 89;
        scores[scores.length-1]= 95;
        scores[3]= 75;
        scores[0]=65;
        scores[2]=55;

        System.out.println(Arrays.toString(scores));

        System.out.println("-------------------------------------------");

        String[] month={"Jan", "Fev", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);

        }
        System.out.println("---------------------------------------------------");

        for (int i = month.length-1; i >=0 ; i--) {
            System.out.print(month[i] + " " );

        }





    }
}
