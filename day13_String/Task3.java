package day13_String;

public class Task3 {
    public static void main(String[] args) {
        String str = "Hello";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(str.length()-1);
        if (ch1==ch2){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }



    }
}
//write a program that can check if the first and last characters of the string are same
//            ex:
//                level
//            output:
//                same
