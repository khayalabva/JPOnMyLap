package day04_Variables;

public class Currencies {

    public static void main(String[] args) {
        int dollar = 1000;
        double lira = dollar * 18.24;
        double euro = dollar * 0.99;
        double rub = dollar * 60.25;
        double cad = dollar * 0.78;
        double azn = dollar * 1.70;
        double huv = dollar * 389.96;
        System.out.println("dollar = " + dollar);
        System.out.println("euro = " + euro);
        System.out.println("rub = " + rub);
        System.out.println("lira = " + lira);
        System.out.println("cad = " + cad);
        System.out.println("azn = " + azn);
        System.out.println("huv = " + huv);
    }
}
