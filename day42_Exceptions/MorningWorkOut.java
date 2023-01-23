package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("-----------------------PUSH UP STARTED-------------------");

        for (int i = 0; i <=40 ; i++) {

            System.out.print("\rPush up " + i);

            // \r part is for printing everything in one lne

            try {
                Thread.sleep(150);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("-----------------------PUSH UP COMPLETED-------------------");

        System.out.println("-----------------------PULL UP STARTED-------------------");

        for (int i = 1; i <= 20 ; i++) {

            System.out.print("\rPull up "+i);
            sleep(0.5);
        }
        System.out.println();
        System.out.println("-----------------------PULL UP COMPLETED-------------------");
    }




    public static void sleep(double seconds){
        try {
            Thread.sleep((long) seconds * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
//MorningWorkOut:
//			1. Do 30 push-ups and try pausing 1.5 seconds in each
//			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
