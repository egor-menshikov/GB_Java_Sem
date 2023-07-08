package HOMEWORKS.HW4.Task_3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(rd.nextInt(1, 11));
        }
        System.out.println(list);
        System.out.println(listSum(list));
    }

    public static int listSum(LinkedList<Integer> list) {
        int sum = 0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        return sum;
    }
}
