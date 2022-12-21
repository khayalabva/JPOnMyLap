package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {


        // assignment: =
        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;

        System.out.println("number = " + number);

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);

        // Addition Assignment:
        int x = 100;

        System.out.println("x = " + x);

        System.out.println(x+ 200 ); //300

        x = x + 200;

        System.out.println("x = " + x);


        x+=200;  // x = x+ 200

        System.out.println("x = " + x);
        System.out.println("---------------------------");

        String str ="Wooden";
        str+= "Spoon";

        System.out.println("str = " + str);

        System.out.println("--------------");

        double num1 = 2.5;
        num1+=5.5;

        System.out.println("num1 = " + num1);

        System.out.println("----------------");

        double availableBalance = 1000.50;

        // deposit $300

        availableBalance+= 300;

        System.out.println("availableBalance = " + availableBalance); //1300.50

        System.out.println("--------------------------");

        // withdrawing $500

        availableBalance -=500; // availableBalance = 1300.50 - 500

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("--------------------");

        double salary = 50000.50;

        salary *=2;

        System.out.println("salary = " + salary);

        int num2 = 2;

        num2 /=2;

        System.out.println("num2 = " + num2);

        double num3 = 100;

        // %=

        num3 %= 3;

        System.out.println("num3 = " + num3);

        int amount = 127;

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("------------------------------------------------------");

        int y =300;
        y %=16;
        System.out.println("y = " + y);
        System.out.println("---------------------------------------------------------");





        int balance = 3500;

        //insurance fee: $153

        balance %= 153;

        System.out.println("balance = " + balance);




    }
}
