package day22_MultidimentionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";
        String[] word = sentence.split(" ");
        System.out.println(Arrays.toString(word));

        String reversedSentence = "";
        for (int i = word.length - 1; i >= 0 ; i--) {
            reversedSentence += word[i] + " ";
        }
        System.out.println(reversedSentence);

    }
}
