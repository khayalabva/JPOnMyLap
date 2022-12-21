package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {


        String str = " ";
        boolean r = str.isEmpty();
        System.out.println("r = "+ r);

        boolean r1 = str.isBlank();
        System.out.println("r1 = " + r1);

        System.out.println("---------------------------------------");

        String s1 = "Cydeo";
        String s2 = "cydeo";

        System.out.println(s1.equalsIgnoreCase(s2));  //true

        System.out.println("------------------------");

        String sentence = "My favorte programming language is Java";

       boolean hasCSharp =  sentence.contains("C#"); //false
        System.out.println(hasCSharp);

       boolean hasJava = sentence.contains("java");  //true
        System.out.println(hasJava);

        boolean hasJava2 = sentence.toLowerCase().contains("java");
        System.out.println(hasJava2);

        System.out.println("---------------------------------------");
        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");
        // in order to ignore case sensitivity we first create lower/upper cas version of string, then we compare them

        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
