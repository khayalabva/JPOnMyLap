package day21_forEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"Ali Kilic", "Hulya Keles", "Sinem Kaya"};

        for( String each : names){
            String initial = each.charAt(0)+""+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }


    }
}
