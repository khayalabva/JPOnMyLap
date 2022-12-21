package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    static class A {

    }  //static means that it belongs to some class. that is why outer class cannot be static
    static class B {
        public static void method1(){

        }
    }

    public static int num = 100;
    public static void method(){

    }
    static {

    }


}
