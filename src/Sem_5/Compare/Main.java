package Sem_5.Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("vw", 1990));
        list.add(new Car("re", 2020));
        list.add(new Car("volvo", 1850));
        list.add(new Car("mers", 2002));
        list.add(new Car("lada", 2015));

        Collections.sort(list);

        for(Car car: list)
            System.out.printf("%s \t %d\n", car.getModel(), car.getYear());
    }
}
