package day21_forEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 6, 20, 0};
        int max = numbers[0]; //10

      /*  for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max) {   // if tehre is element in the array greater that the current max num
                max = numbers[i];
            }
        }
        System.out.println(max);
     */
     for (int each : numbers){
         if(each > max){
             max = each;
         }
     }
        System.out.println(max);

    }
}
