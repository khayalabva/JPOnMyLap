package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int number=2;
        int year = 2002;

        if (number >= 1 && number <= 12){ // number:1~12
            switch (number) {
                case 2:
                    if(year % 4 == 0) {
                        System.out.println("29 days");
                    }else{
                        System.out.println("28 days");
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 days");
            }
            }else{
            System.out.println("Invalid number");
        }




    }


}
