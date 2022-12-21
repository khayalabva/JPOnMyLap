package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str); // int

        System.out.println(num+1);
        System.out.println(str+1);


        System.out.println("---------------------------------");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println(max);
        System.out.println(min);

        System.out.println("----------------------------------");

        double x = 10;
        System.out.println(x);

        System.out.println("------------------------------------");

        String s1 = "true";
        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("--------------------------------------");

        String s2 = "123";
        Integer z = Integer.valueOf(s2);
        int y = Integer.valueOf(s2);

        System.out.println(z);

        String s3 = "1.5";
        Double v = Double.valueOf(s3);
        System.out.println(v);

        System.out.println("------------------------------------------------------------");

        //isDigit

        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1);
        boolean r3 = Character.isLetter(ch1);

        System.out.println(r2);
        System.out.println(r3);

        //special char
        char ch2 = '@';
        boolean r5 = !Character.isLetter(ch2);

        //upperCase
        boolean r4 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println("-----------------------------");

        String s = "kaubxwl298wy1sb8e7";

        int sum = 0;
        for(char each : s.toCharArray()){
            if(Character.isDigit(each)){
                sum+= Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);




    }
}
