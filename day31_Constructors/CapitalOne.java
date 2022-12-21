package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Soyturk", 12345678);

        System.out.println(account1);

        account1.deposit(5000);
        account1.checkBalance();

        account1.withdraw(230);
        account1.checkBalance();

        System.out.println("--------------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Lola Molla", 34345612);

        System.out.println(account2);

        account2.deposit(34000);
        account2.checkBalance();


    }
}
