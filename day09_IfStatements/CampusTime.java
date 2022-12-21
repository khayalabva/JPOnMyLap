package day09_IfStatements;

public class CampusTime {
    public static void main(String[] args) {


    int time = 23;
    if (time >= 0 && time < 8 || time >=23 && time <=24){
        System.out.println("closed");

    }else if(time >= 8 && time <23){
        System.out.println("open");
    }else{
        System.out.println("not valid");
    }
}
}