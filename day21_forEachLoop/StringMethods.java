package day21_forEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";

        for(char ch : str.toCharArray()){
            System.out.println(ch);

        }

        System.out.println("-----------------------");

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------");

        String email = "woodenspoon@cydeo.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java.";
        String[] sent = s.split("\\.");
        System.out.println(Arrays.toString(sent));



    }
}
