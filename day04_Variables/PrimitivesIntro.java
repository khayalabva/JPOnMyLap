package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;


        // weight: 160 pounds
                            // 160 is greater then 127 that is why it gives error
                            // 160 is out of the byte's range
        short weight = 160; // 160 is within the short's range

        //salary: 1000000$
        int salary = 100_000; // int is a preferred data type for integer numbers

        long asset = 3_333_333_333L;


        // tax: 0.26

        float tax = 0.26f;
        double PI = 3.14; // double is a preferred data type for desmall numbers


        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 870;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        System.out.println("gender = " + gender);

        char yesNo = 'Y';
        System.out.println("yesNo = " + yesNo);

        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;


        String name = "Wooden Spoon";
        String city = "Rome";
        String state = "Virginia";
        String country = "Italy";




    }
}
