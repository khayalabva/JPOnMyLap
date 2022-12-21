package day15_ForLoop;

public class Task7 {
    public static void main(String[] args) {
        String str = "Kayala baghirova";
        String result = "";

        str.charAt(str.length()-1);
        int length = str.length()-1;
        for (int i = length; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }



    }
}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */
