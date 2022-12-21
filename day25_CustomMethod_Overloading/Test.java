package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "Java Programming Langiage";

        StringUtility.printEachChar(str);

        String str1 = StringUtility.reverse(str);
        System.out.println(str1);

        System.out.println("---------------------------------------");
        String word = "level";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println(palindrome);

        System.out.println("-------------------------------------------");

        String[] names = {"Anna", "Mom", "Java", "lol", "Rome"};
        int count = 0;
        for(String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
        }}
        System.out.println(count);

        System.out.println("-----------------------------------------");

        String str3 = "aaaaaaaaaaaaaaaaaavvvvvvvvvvvvffffffffffffuuuuuuuu";
        String nonDup = StringUtility.removesDuplicates(str3);
        System.out.println(nonDup);




    }
}
