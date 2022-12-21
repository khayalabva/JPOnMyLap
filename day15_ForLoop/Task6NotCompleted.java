package day15_ForLoop;

public class Task6NotCompleted {
    public static void main(String[] args) {

        String str = "5tc&gvA34";
        int num = 0;


        for (int i = str.length(); i >= 0 ; i--) {
           char ch = str.charAt(i);
            if(ch >='0' && ch<='9' ){
                num+=(int)ch;
            }

        }
        System.out.println("Result: " + num);




    }
}
/*
 Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */