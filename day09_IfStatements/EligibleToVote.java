package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Lola";
        int age = 28;
        if(age>=18) {
            System.out.println(name + " is eligible to vote");
        }else{
            System.out.println(name + " is NOT eligible to vote");
        }


    }
}
