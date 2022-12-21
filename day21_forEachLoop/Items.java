package day21_forEachLoop;

public class Items {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        //                   0         1           2         3        4           5

        double[] prices = {99.99,   150.0,  9.99,   250.0 ,  439.50,  39.99};
        //                   0        1       2       3        4         5

        int[] itemIDs =   {12345 ,  12346,  12347,  12348,  12349,   12350};
        //                   0        1       2       3       4        5

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemIDs[i];

            System.out.println(item+" - "+id +" - $"+price);
        }
        String ta = "A";
        ta = ta.concat("B");
        String tb = "C";
        ta = ta + tb;
        ta.replace('C','D');
        ta = ta+tb;
        System.out.println(ta);

    }
}
