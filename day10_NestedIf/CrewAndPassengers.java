package day10_NestedIf;

public class CrewAndPassengers {
    public static void main(String[] args) {
        /*
        Create a class called CrewAndPassengers,
        Given a number of people on the ship (int number), determine how many need to be crew members
        and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

         */
        int n =46;

        String total = (n>=0 && n<=100)? (n<=50)? "20 crew, 30 passengers":(n<=75)?
                "25 crew, 50 passengers": "30 crew, 70 passengers": "Invalid Number";
        System.out.println(total);







    }

}
