package Sem_6_real.Task_2;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Матрос", "обычный", 21);
        Cat cat2 = new Cat("Вакса", "черный", 7);
        Cat cat3 = new Cat("Пискля", "серый", 7);
        Cat catMatros = new Cat("Матрос", "обычный", 21);
        HashSet<Cat> cats = new HashSet<>(List.of(cat1, cat2, cat3, catMatros));

        for (Cat cat :
                cats) {
            System.out.println(cat);
        }
        System.out.println(cat1 == catMatros);
        System.out.println(cat1.equals(catMatros));

        for (Cat cat :
                cats) {
            if(cat.age == 7)
                System.out.println(cat);
        }
    }
}
