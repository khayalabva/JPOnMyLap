package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

         */
        int grade = 67;
       /* String result;
        if (grade >=1 && grade <=18){
           result = (grade<=5)? "Elementary School" :(grade <=8)? "Middle School":(grade<=12)? "Hiigh school":
                    (grade<=16)? "College": "Grad school";
        }else{
            result ="Invalid Grade";
        }
        System.out.println(result);
*/
        String result = (grade >=1 && grade <=18)? (grade<=5)? "Elementary School" :(grade <=8)? "Middle School":(grade<=12)? "Hiigh school":
                    (grade<=16)? "College": "Grad school" : "Invalid Grade";

        System.out.println(result);




    }
}
