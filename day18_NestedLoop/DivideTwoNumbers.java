package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        // 20/6 = 3 and reminder of 2

        int a = 64;
        int b = 6;
        int count = 0;

        /*

                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2

         */

        while (a>=b){
            a -= b;
            count++;

        }
        System.out.println(count);



    }
}
