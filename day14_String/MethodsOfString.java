package day14_String;

public class MethodsOfString {
    public static void main(String[] args) {
        String str1="          batch25       ";
       str1 =  str1.trim();  // "batch 25"
        System.out.println(str1);

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("ool");
        System.out.println(n1);

        String str3 = "Harry Potter";
        int n2 = str3.indexOf("t");
        System.out.println(n2);
        int n3 = str3.lastIndexOf("r");
        System.out.println("n3 = " + n3);

        System.out.println("------------------------");

        String s = "Java Nova Wawa orange";
        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);
        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);
        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);
       // int fourthA = s.indexOf("ava W"); or
        //int fourthA =  s.lastIndexOf("av"); or
        int fourthA = s.indexOf("Ca") + 1;
        System.out.println("fourthA = " + fourthA);
        int fifthA = s.lastIndexOf("a W");


    }
}
