package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String[] countryNames = {"Japan", "Turkey", "United States", "Italy", "Greece", " United Kingdom", "Canada"};

        //converting array to arrayList

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countryNames));

        list.removeIf(p -> p.length() >= 10);

       countryNames =  list.toArray(new String[0]);




    }
}
