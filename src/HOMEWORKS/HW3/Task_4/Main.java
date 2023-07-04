package HOMEWORKS.HW3.Task_4;

//Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[13];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(-5, 16);
        }
        System.out.println(Arrays.toString(array));

        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] arr) {
        if (arr.length == 1)
            return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < arr.length - mid; i++) {
            right[i] = arr[i + mid];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int lPos = 0;
        int rPos = 0;
        int arrPos = 0;

        while (lPos < left.length && rPos < right.length) {
            if (left[lPos] < right[rPos]) {
                arr[arrPos++] = left[lPos++];
            } else {
                arr[arrPos++] = right[rPos++];
            }
        }

        for (int i = lPos; i < left.length; i++) {
            arr[arrPos++] = left[i];
        }
        for (int i = rPos; i < right.length; i++) {
            arr[arrPos++] = right[i];
        }
    }
}
