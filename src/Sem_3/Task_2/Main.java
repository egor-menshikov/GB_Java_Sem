package Sem_3.Task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{9, 2, 5, 3, 3, 8, 10, 7};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.sort(null);
        System.out.println(list);
        list.add(ThreadLocalRandom.current().nextInt(0, 11));
        System.out.println(list);

    }
}
