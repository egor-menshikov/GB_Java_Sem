package Sem_6;

// Спросить почему хэш разный
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Егор";
        w1.lastName = "Меньшиков";
        w1.salary = 100;
        w1.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Егор";
        w2.lastName = "Меньшиков";
        w2.salary = 100;
        w2.id = 1000;

        Worker w3 = new Worker();
        w3.firstName = "Петр";
        w3.lastName = "Меньшиков";
        w3.salary = 200;
        w3.id = 2000;

        Worker w4 = new Worker();
        w4.firstName = "Егор";
        w4.lastName = "Меньшиков";
        w4.salary = 100;
        w4.id = 1000;

        var workers = new HashSet<>(Arrays.asList(w1, w2, w3));
        for (var worker :
                workers) {
            System.out.println(worker);
        }

        System.out.println(w1.equals(w2));
        System.out.println(workers.contains(w4));
    }
}
