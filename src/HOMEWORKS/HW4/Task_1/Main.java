package HOMEWORKS.HW4.Task_1;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//Постараться не обращаться к листу по индексам.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] array = randomArray(10, -3, 15);
        List<Integer> l_ = Arrays.asList(array);
        LinkedList<Integer> list = new LinkedList<>(l_);
        System.out.println(list);

        LinkedList<Integer> answer = reverseLL(list);
        System.out.println(answer);
    }

    private static LinkedList<Integer> reverseLL(LinkedList<Integer> list) {
        LinkedList<Integer> result = new LinkedList<>();
        ListIterator<Integer> li = list.listIterator(list.size());
        while (li.hasPrevious())
            result.add(li.previous());
        return result;
    }

    public static Integer[] randomArray(int len, int min, int max) {
        Random rd = new Random();
        Integer[] arr = new Integer[len];
        for (int i = 0; i < len; i++)
            arr[i] = rd.nextInt(min, max + 1);
        return arr;
    }
}
