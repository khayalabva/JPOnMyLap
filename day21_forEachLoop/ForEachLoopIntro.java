package day21_forEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70,80,90};

        for (int i = 0; i < numbers.length; i++) {
            int each = numbers[i];
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------");

        for ( int eachElement: numbers ){
            System.out.print(eachElement + " ");

        }

    }
}
