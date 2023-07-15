package HOMEWORKS.HW6_final;

import java.util.HashSet;

public class LaptopsList {
    public static HashSet<Laptop> laptops = new HashSet<>();

    public static HashSet<Laptop> addLaptops() {
        laptops.add(new Laptop("Acer Aspire 3", "Ryzen 3 7320U", "AMD Radeon 610M",
                16, 256, 42570, 15, Laptop.Color.SILVER));
        laptops.add(new Laptop("Acer Aspire 5", "Ryzen 3 5425U", "NVIDIA MX450",
                8, 512, 61170, 17, Laptop.Color.BLUE));
        laptops.add(new Laptop("ASUS VivoBook S 15", "Ryzen 5 5600H", "AMD Radeon Graphics",
                16, 512, 58990, 14, Laptop.Color.BLACK));
        laptops.add(new Laptop("ASUS VivoBook S 16X", "Ryzen 7 5800H", "AMD Radeon Graphics",
                16, 1024, 79890, 16, Laptop.Color.BLACK));
        laptops.add(new Laptop("ASUS X515EA", "i3-1115G4", "Intel UHD Graphics",
                4, 256, 37690, 15, Laptop.Color.GREY));
        laptops.add(new Laptop("HASEE Z8-DA7NS", "i7-12650H", "NVIDIA RTX 3060 для ноутбуков",
                16, 1024, 94900, 15, Laptop.Color.BLACK));
        laptops.add(new Laptop("HIPER DZEN", "i5-1135G7", "Intel Iris Xe Graphics",
                16, 512, 59300, 14, Laptop.Color.GREY));
        laptops.add(new Laptop("HIPER EXPERTBOOK", "i5-1235U", "Intel Iris Xe Graphics",
                8, 256, 72200, 16, Laptop.Color.BLACK));
        laptops.add(new Laptop("Huawei MateBook 14s", "i7-12700H", "Intel Iris Xe Graphics",
                16, 1024, 112000, 14, Laptop.Color.GREY));
        laptops.add(new Laptop("HP Omen 16", "Ryzen 7 5800H", "NVIDIA RTX 3070 для ноутбуков 8GB",
                16, 1024, 117800, 17, Laptop.Color.BLUE));
        laptops.add(new Laptop("Lenovo IdeaPad 1", "Ryzen 3 7320U", "Intel UHD Graphics",
                8, 256, 34000, 14, Laptop.Color.GREY));
        laptops.add(new Laptop("Lenovo IdeaPad 3", "i5-1235U", "Intel UHD Graphics",
                8, 512, 34000, 15, Laptop.Color.BLUE));
        laptops.add(new Laptop("Lenovo IdeaPad 5 Pro", "i7-1260P", "Intel Iris Xe Graphics",
                16, 512, 146400, 14, Laptop.Color.SILVER));
        laptops.add(new Laptop("Lenovo IdeaPad Gaming 3", "Ryzen 7 6800H", "NVIDIA RTX 3050Ti для ноутбуков 4Gb",
                16, 1024, 119500, 15, Laptop.Color.BLACK));
        laptops.add(new Laptop("Lenovo Legion 5", "i7-12700H", "NVIDIA RTX 3070Ti для ноутбуков 8Gb",
                32, 1024, 228700, 15, Laptop.Color.GREY));
        laptops.add(new Laptop("Lenovo Legion 7", "i7-12800HX", "NVIDIA RTX 3070Ti для ноутбуков 8Gb",
                32, 2048, 367700, 16, Laptop.Color.GREY));
        laptops.add(new Laptop("Lenovo Legion 7", "i9-12900HX", "NVIDIA RTX 3080Ti для ноутбуков 16Gb",
                32, 2048, 438000, 17, Laptop.Color.SILVER));
        laptops.add(new Laptop("MSI Creator Z16", "i7-12700H", "NVIDIA RTX 3060 для ноутбуков 6Gb",
                16, 512, 156800, 17, Laptop.Color.BLACK));
        return laptops;
    }


}
