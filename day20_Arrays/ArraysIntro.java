package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable that can contain 5 names

        String[] myGroup = new String[5];   // can be also  String myGroup[]; // 0~4 are index numbers

        myGroup[0] = "Wasta";
        myGroup[1] = "Lola";
        myGroup[2] = "Asiman";
        myGroup[3] = "Alima";
        myGroup[4] = "Emin";

        // System.out.println(myGroup);   is an hasgtag
        System.out.println(Arrays.toString(myGroup)); //["Wasta", "Lola", "Asiman", "Alima", "Emin"]

        System.out.println("-----------------------------------------------------");


        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number < 1 || number > 7){
            System.out.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);








    }
}
