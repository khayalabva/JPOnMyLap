package day03_EscapeSequences;

/*
Escape sequences : Must be given with double quote
   \n: starts va new line
   \t: paragraph space(tab)
   \\: backslash
   \": doublequote
 */

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPyton \nC#");

        System.out.println("--------------------------");


        System.out.println("Hello Sydeo! \nHow are you today? \nIt is nice to see you all! \nWhat class do we have next week?");

        System.out.println("---------------------------");

        System.out.println("\tJava is Cool Programming Language");
        System.out.println("Java is very cool.");

        System.out.println("-------------");

        System.out.println("/\\"); // in order to give one backslash we need to give two backslashes
        System.out.println("--------------------");

        System.out.println("My fav TV show is \"Game of Thrones\"");  // in order to print a doublequote we need to use \"

    }

}
