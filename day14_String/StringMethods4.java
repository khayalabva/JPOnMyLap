package day14_String;

public class StringMethods4 {
    public static void main(String[] args) {

        String str = "Cydeo";

        str = str.repeat(4); //CydeoCydeoCydeo

        System.out.println(str);

        String str2 = "Wooden Spoon ";
        str2= str2.repeat(100);
        System.out.println(str2);

        String str3 = "Life is Good ";
        System.out.println(str3.repeat(40));


    }
}
