package day34_GarbageCollection_AccessModifiers;

public class StaticBlog {

    public static void main(String[] args) {
        System.out.println("Main Blog");

    }

    static {       // runs before anything, runs only one time
        System.out.println("Static Blog 1");
    }
    static {
        System.out.println("Static Blog 2");
    }
    static {
        System.out.println("Static Blog 3");
    }

}
