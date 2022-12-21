package day15_ForLoop;

public class Task2 {
    public static void main(String[] args) {
     int num =0;

        for (int i = 0; i <=100; i++) {
            if(i%2==0){
                num+=i;
            }

        }
        System.out.println(num);


    }
}
// 2. Write a program that can return the sum of odd numbers between 1 to 100
