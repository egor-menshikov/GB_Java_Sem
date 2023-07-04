package HOMEWORKS.HW3.Task_1;

//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            array.add(rd.nextInt(0, 101));
        }
        System.out.println(array);
        array.removeIf(item -> item % 2 == 0);
        System.out.println(array);
    }
}
