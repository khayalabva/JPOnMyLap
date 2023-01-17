package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

       // System.out.println(a / b);  //unchecked exception

        char[] chars = {'A', 'B', 'C'};

       // System.out.println(chars[99]); //unchecked exception

        Student student = null;

        //System.out.println(student.getName()); //unchecked exception

        String str = "Wooden Spoon";

        str = null;

        System.out.println(str.toLowerCase());

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty());



        // checked Exception:

        System.out.println("Hello");

        //Thread.sleep(3000);

        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file");



    }

}
