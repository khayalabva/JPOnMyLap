package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "Ahmed", "David", "Sarah", "Jimmy", "Vince", "Federico"));
        employees.retainAll(Arrays.asList("Ali", "David"));

        System.out.println("------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(n -> n.charAt(0)=='M');

        System.out.println(list);

        names = list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));

    }
}
