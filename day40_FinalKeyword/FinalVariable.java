package day40_FinalKeyword;

public class FinalVariable {

    final  String birthday;
    final  static  String name;

    static {
        name = "Batch E-10";
    }

    public FinalVariable(String birthday){
        this.birthday = birthday;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        final  String name;
        name = "java";

        FinalVariable obj = new FinalVariable("May/01");

        //obj = "Oct/27";  - final variables cannot be reassigned

        System.out.println(obj);

        System.out.println("-----------------------------------------");

        System.out.println(name);


    }
}
