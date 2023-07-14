package HOMEWORKS.HW6_final;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Acer Aspire 3", "Ryzen 3 7320U", "AMD Radeon 610M",
                8, 256, 42570, 15.6, Laptop.Color.SILVER);
        Laptop l2 = new Laptop("Acer Aspire 3", "Ryzen 3 7320U", "AMD Radeon 610M",
                8, 257, 42570, 15.6, Laptop.Color.SILVER);
        HashSet<Laptop> pricelist = new HashSet<>();
        pricelist.add(l1);
        pricelist.add(l2);
        for (Laptop item : pricelist) {
            System.out.println(item);
        }
    }
}
