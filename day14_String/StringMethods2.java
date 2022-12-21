package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Phython");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        System.out.println("email = " + email);

        String gmail = email.replace("yahoo", "gmail");
        System.out.println("gmail = " + gmail);

        String s = "Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2= "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);

        System.out.println("----------------------------");

        String result = "java java java";
        result = result.replaceFirst("java", "phyton");
        System.out.println("result = " + result);







    }
}
