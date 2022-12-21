package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {

        /*
         Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            otherwise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
        char grade ='Z';
        boolean validGrade= (grade >='A' && grade <= 'D')|| grade=='F';

        String result = (validGrade)? (grade =='A')? "excellent" : (grade =='B')? "great job":
                (grade=='C')? "good": (grade =='D')? "passed": "failed": "invalid grade";


        System.out.println(result);




    }
}
