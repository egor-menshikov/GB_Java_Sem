package HOMEWORKS.HW6_final;

/*
PriceFilter - логика программы.
Laptop - сам класс ноутбуков.
LaptopsList и Text - список ноутов и текстовые сообщения, убрал туда чтобы не мешались.

Ноутов добавил не сильно много, изначально хотел парсить .xls прайс-лист одного сайта,
но у меня времени мало сейчас, решил не возиться. Хотя, может бы и разобрался за то время, что вручную их вписывал :)
*/

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Laptop> set = LaptopsList.addLaptops();
        PriceFilter pf = new PriceFilter(set);
        pf.filter();
    }
}
