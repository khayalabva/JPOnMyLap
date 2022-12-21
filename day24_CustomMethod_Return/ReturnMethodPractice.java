package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
    // find the max number between 100 and 200
       int maxNumber = max(4,20);
        System.out.println(maxNumber);

        int multiplication = maxNumber * 2;
        System.out.println(multiplication);



        // multiply the max number by 2


    }
    public static int max (int a, int b){

        int result = 0;

        if (a > b){
            result = a;
        }else{
            result = b;
        }
        return result;

    }


}
