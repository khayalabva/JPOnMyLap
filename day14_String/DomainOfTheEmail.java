package day14_String;

public class DomainOfTheEmail {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println(domain);

        System.out.println("----------------------------------");

        String str1 = "Java is fun, Java is cool";
        String s1 = str1.substring(0, str1.indexOf(","));
        System.out.println(s1);

        String s2 = str1.substring(str1.lastIndexOf("J"));
        System.out.println(s2);



    }
}
