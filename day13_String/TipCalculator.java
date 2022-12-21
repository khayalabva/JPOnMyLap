package day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)?");
        String yesOrNo = scan.next();

        System.out.println("Enter the number of people");
        int people = scan.nextInt();

        System.out.println("Enter the check amount:");
        int amount = scan.nextInt();

        System.out.println("How was the srvice quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scan.next();

        double tipRate = (quality.equals("excellent"))? 0.25: (quality.equals("great"))? 0.2 :
                (quality.equals("good"))? 0.15 : (quality.equals("fair"))? 0.1 : 0.05;
        double totalTip = amount*tipRate;

        System.out.println("Number of people entered: " + people);
        System.out.println("Total amount to pay: " + amount);
        System.out.println("Total tip:  " + totalTip);

        if (yesOrNo.equals("yes")){
            System.out.println("Total per person: " + (amount/people));
            System.out.println("Tip per person: "+ (totalTip/people));
        }else{
            System.out.println("Thank You!");
        }

scan.close();

    }
}
/*
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and
if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),
	Number of people entered: (number) (each person = & in output)
	Check amount: (number)
	Service Quality: (String)
	Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method

 */