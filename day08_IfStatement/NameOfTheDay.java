package day08_IfStatement;

public class NameOfTheDay {
    public static void main(String[] args) {


        int num = 5;

        boolean mon = num == 1,
                tue = num == 2,
                wed = num == 3,
                thu = num == 4,
                fri = num == 5,
                sat = num == 6,
                sun = num == 7;
        if (mon) {
            System.out.println("Monday");
        }
        if (tue) {
            System.out.println("Tuesday");
        }
        if (wed) {
            System.out.println("Wednesday");
        }
        if (thu) {
            System.out.println("Thursday");
        }
        if (fri) {
            System.out.println("Friday");
        }
        if (sat) {
            System.out.println("Saturday");
        }
        if (sun) {
            System.out.println("Sunday");
        }


    }
}
/*
write a program that can display the name of the day

			number = 1 ~ 7
 */
