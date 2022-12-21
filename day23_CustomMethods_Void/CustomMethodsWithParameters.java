package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(9);
    }



    public static void oddOrEven(int num){
        if (num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");
        }

    }
}
