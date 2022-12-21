package day12_Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ShippingAddress {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = scan.next();

        scan.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.nextLine();

        System.out.println("Enter your ZIP code:");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your country:");
        String country = scan.nextLine();

        System.out.println("Full Name = " + fullName);
        System.out.println("Building Number = " + buildingNumber);
        System.out.println("Street Name = " + streetName);
        System.out.println("City Name = " + cityName);
        System.out.println("State = " + state);
        System.out.println("ZIP code = " + zipCode);
        System.out.println("Country = " + country);


        scan.close();






    }
}
/*
1. enter your full name       nextLine()
2. enter your building number    next()
3. enter your street name       nextLine
4. enter your city name             nextLine
5. enter your state                next()
6. enter your zip code              next()


Display the shipping adress
 */