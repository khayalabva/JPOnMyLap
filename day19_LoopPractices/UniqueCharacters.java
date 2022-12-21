package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

       /* String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); ///   //each character of str

            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                result+=ch;
            }


        }

        System.out.println(result);
*/

        String str = "aabccdeef";
        String result = ""; //bdf


     //   char ch = 'a';

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int frequency =0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    frequency++;
                }

            }
            if (frequency == 1) {
                result += ch;
            }


        }
        System.out.println(result);

    }
}
