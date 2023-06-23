package Sem_1.Task_2;

//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = randarr(20, 0, 1);
//        for (int item : array
//        ) {
//            System.out.printf("%d ", item);
//        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println(max_ones(array));
    }

    static int max_ones(int[] arr) {
        int count = 0;
        int max_count = 0;
        for (int item : arr
        ) {
            if (item == 1)
                count++;
            else
                count = 0;
            if (max_count < count)
                max_count = count;
        }
        return max_count;
    }

    static int[] randarr(int len, int min, int max) {
        int[] arr = new int[len];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * (max - min + 1) + min);
//        }
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(min, max + 1);
        }
        return arr;
    }
}
