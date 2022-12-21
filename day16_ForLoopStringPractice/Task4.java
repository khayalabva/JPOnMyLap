package day16_ForLoopStringPractice;

public class Task4 {
    public static void main(String[] args) {

String str = "java java java java java java java java java java java java java java java java java ";
int frequency = 0;

        for (int i = 0; i < str.length()-4; i++) {
            String eachSub = str.substring(i, i + 5);
            // System.out.println(eachSub);
            if (eachSub.equals("java ")) {
                frequency++;
            }
        }

        System.out.println(frequency);
    }
}
