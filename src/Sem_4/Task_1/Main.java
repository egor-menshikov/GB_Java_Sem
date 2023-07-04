package Sem_4.Task_1;

//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        ArrayList list1 = new ArrayList();
        LinkedList list2 = new LinkedList();
        for (int i = 0; i < 100000; i++) {
            list1.add(0,i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);

    }
}
