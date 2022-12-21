package day24_CustomMethod_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {
        nameOfMonth(4);
        nameOfMonth(13);
    }


    public static void nameOfMonth (int numOfMonth) {

        if (numOfMonth < 1 || numOfMonth >12){
            System.out.println("Invalid");
            return;   //exits nameOfMonth method
        }
        switch (numOfMonth) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Fev");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            default:
                System.out.println("Dec");

        }
    }
}
