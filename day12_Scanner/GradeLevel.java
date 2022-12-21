package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        /*
         1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given
         */

        byte num = 15;
        String reslut ="";


        if (num >=1 && num<=18 ){
            switch(num){
                case 1:case 2: case 3: case 4: case 5:
                    reslut="Elementary school";
                    break;
                case 6: case 7: case 8:
                    reslut="Middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    reslut= "High school";
                    break;
                case 13: case 14: case 15: case 16:
                    reslut= "College";
                    break;
                default:
                    reslut= "Grad School";
                    break;

            }

        }else{
            reslut="Invalid grade level given";
        }


        System.out.println(reslut);

    }
}
