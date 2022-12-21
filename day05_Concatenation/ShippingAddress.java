package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        /*
        1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
         */
    String name = "Khayala Baghirova",
            buildingNuber = "21A",
            streetName = "Via Tito Omboni",
            city = "Rome",
            state = "Lazio",
            zipCode = "00147B";

        System.out.println(name + "\n" + buildingNuber + " " + streetName +
                "\n" + zipCode + ", " + city + ", " + state);




    }
}
