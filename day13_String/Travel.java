package day13_String;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a valid passport?");
        String yesOrNo = scan.next();

        int total=0;

        if (yesOrNo.equalsIgnoreCase("Yes")){
            System.out.println("The base cost of the ticket is 1000");
            int baseCost =1000;
            total +=baseCost;

            System.out.println("Where are you travelling?");
            String country = scan.next();

            System.out.println("How many bags will you take?");
            int bags = scan.nextInt();
            total += bags*50;

            System.out.println("How many people are travelling?");
            int people = scan.nextInt();
            total+=people*baseCost - people*100;

            System.out.println("Enter the name of travellers in a same line with comma:");
            String names = scan.nextLine();
            scan.nextLine();

            System.out.println(" Your ticket is booked to " + country + ". We have charged extra for " +bags+ " bags but you are traveling with " + people+ " people, so we are giving a discount $" + (people*100 ) +
                    ". Your total cost is $" + total);




        }else{
            System.out.println("The base cost of the passport renewal is: 200");
            total +=200;
            System.out.println("When did your passport expire (in years)?");
            int expired = scan.nextInt();
            total +=expired*75;
            System.out.println("Which country do you plan to visit?");
            String country = scan.next();

            System.out.println("Are you going to visit next year?");
            String yOn = scan.next();

            if (yOn.equalsIgnoreCase("yes")){
                total+=100;
            }else{
                total-=50;
            }
            System.out.println("Looks like your password has been expired for " + expired + " years, but not to worry we will get it ready for you to travel to " + country+ ". Your total cost has come out to $" +total+".");



        }
    }
}
/*
. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line,
            		 separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName.
            		We have charged extra for the $numberOfBags bags
            		but you are traveling with $peopleYouTravelWith so we are giving a discount.
            		Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."


 */