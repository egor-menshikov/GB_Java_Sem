package HOMEWORKS.HW3.Task_2;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное
//и среднее арифметическое из этого списка. Collections.max()

// Не нашел в Collections как среднее искать)


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            array.add(rd.nextInt(0, 11));
        }
        System.out.println(array);
        System.out.println("Max = " + Collections.max(array));
        System.out.println("Min = " + Collections.min(array));
        System.out.println("Mean = " + meanNum(array));

    }

    private static double meanNum(List<Integer> arr) {
        int sum = 0;
        for (Integer item :
                arr) {
            sum += item;
        }
        return (double) sum / arr.size();
    }
}
