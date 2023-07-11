package Sem_6_real.Task_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

//1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
//уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class Main {
    public static void main(String[] args) {
        Integer[] array = randomArray(1000, 0, 24);
        System.out.println(Arrays.toString(array));
        System.out.println(uniqNumbers(array));
    }

    public static Integer[] randomArray(int len, int min, int max) {
        Random rd = new Random();
        Integer[] arr = new Integer[len];
        for (int i = 0; i < len; i++) {
            arr[i] = rd.nextInt(min, max + 1);
        }
        return arr;
    }

    public static double uniqNumbers(Integer[] arr) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set.size());
        return set.size() * 100.0 / arr.length;
    }
}
