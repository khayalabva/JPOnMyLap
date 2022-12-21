package day21_forEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String[] names = {"Ali Kilic", "Hulya Keles", "Sinem Kaya"};

        for (String each : names){
            String reversed = "";

            for (int i = each.length()-1; i >= 0 ; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
            }
        }

    }

