package day17_While_DoWhile;

import java.util.Scanner;

public class Task5_RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room?");
        String answer = scan.next();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("invalid answer, please re-enter:");
            answer=scan.next();
        }
        if (answer.equalsIgnoreCase("yes")){

            System.out.println("Which type of room do you want? (queen/king/single)");
            String roomType = scan.next();
            while (!(roomType.equals("king") || roomType.equals("queen") || roomType.equals("single"))) {
                System.out.println("Invalid entry, please retry");
                roomType = scan.next();

                if (roomType.equals("king")) {
                    System.out.println("Your room has King Bed, Price to pay: 120$");
                } else if (roomType.equals("queen")) {
                    System.out.println("Your room has Queen Bed, Price to pay: 100$");

                } else if (roomType.equals("single")) {
                    System.out.println("Your room has Single Bed, Price to pay: 80$");
                }
            }
        }else{
            System.out.println("have a nice day");
        }



    }
}
/*
 Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */
