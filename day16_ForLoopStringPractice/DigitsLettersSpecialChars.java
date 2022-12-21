package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo1526School@#Spoon";

        String digits="";
        String letter ="";
        String specialChars="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // ch:evevry single character that we have in string str
            if(ch>='0' && ch<='9'){
                digits+=ch;
            } else if (ch>='a' && ch<='z') {
                letter+=ch;

            } else if (ch>='A' && ch <='Z'){
                letter+=ch;
            }else {
                if (ch != ' '){
                specialChars+=ch;}
            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letter);
        System.out.println("specialChars = " + specialChars);

    }
}
