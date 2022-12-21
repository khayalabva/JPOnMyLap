package day05_Concatenation;

public class StudentInfo {
    public static void main(String[] args) {

        /*
         2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)
         */

        String studentName = "Kayala";
        byte age = 25;
        char gender ='F';
        String schoolName = "Sapienza";
        String phoneNumber = "(+39)-287-272937";
        boolean fullTime = true;
        double GPA = 3.4 ;

        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("fullTime = " + fullTime);
        System.out.println("GPA = " + GPA);
    }
}
