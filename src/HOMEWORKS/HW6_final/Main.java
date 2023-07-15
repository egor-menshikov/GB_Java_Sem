package HOMEWORKS.HW6_final;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Laptop> set = LaptopsList.addLaptops();
        PriceFilter pf = new PriceFilter(set);
        pf.filter();
    }
}
