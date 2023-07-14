package HOMEWORKS.HW6_final;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Acer Aspire 3", "Ryzen 3 7320U", "AMD Radeon 610M",
                16, 256, 42570, 15, Laptop.Color.SILVER);
        Laptop l2 = new Laptop("Acer Aspire 3", "Ryzen 3 7320U", "AMD Radeon 610M",
                8, 257, 25000, 14, Laptop.Color.BLACK);
        HashSet<Laptop> set = new HashSet<>();
        set.add(l1);
        set.add(l2);
        PriceFilter pf = new PriceFilter(set);
//        for (Laptop item : set) {
//            System.out.println(item);
//        }
        pf.filter();

    }
}
