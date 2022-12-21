package day20_Arrays;
import java.util.Arrays;
public class ArraysPractice2 {
    public static void main(String[] args) {

        char [] letters = new char [26];


        System.out.println(Arrays.toString(letters));
        for (char i = 'A', j=0; i <='Z' && j<letters.length ; i++, j++) { // j - index number 0~last num; i - is a char re[resenting a letter
            letters[j]=i;
            System.out.println(i);

        }

      /*  char ch= 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i]=ch;

        }
*/
        System.out.println(Arrays.toString(letters));


    }
}
