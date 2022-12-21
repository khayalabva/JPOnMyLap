package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {
    public static void main(String[] args) {

        System.out.println(pi); // no need for className --> Circle.pi
        System.out.println(pi);

    }
}
