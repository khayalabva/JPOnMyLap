package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {
        /*
        1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
         */

        String firstName = "Daniel";
        String lastName = "King";
        int age = 54;
        String jobTitle = " SDET";
        String companyName = "Apple Int";
        String salary = "56000k";


        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // Full name of the person is ___________

        System.out.println("Full name of the person is " + fullName );

        // ____ is ___ years old

        System.out.println( fullName + " is " + age + " years old.");

        //fullName is jobTitle, works at companyName, and fullName's salary is Salary.

        System.out.println(fullName + " is a" + jobTitle +
                ", works at " + companyName + ", and " + fullName + "'s salary is $" + salary  );

    }
}
