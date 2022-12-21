package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";
           //idenx:    01234
        char thirdCharacter = word.charAt(2);
        System.out.println("Third Character: " + thirdCharacter);


        System.out.println("-------------------------");

        String s1 = "Batch 25 is the best batch";

        char ninthChar = s1.charAt(8);
        int totalChars = s1.length();
        System.out.println(totalChars);

        char lastChar = s1.charAt( s1.length()-1);
        System.out.println("Last Character: " + lastChar);

        System.out.println("-------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase(); //"WOODEN SPOON

        System.out.println(str);

        System.out.println("-----------------");

        String s = "JAVA";

        s = s.toLowerCase();
        System.out.println(s);




    }
}
