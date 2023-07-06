package HOMEWORKS.HW4.Task_2;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class MyQueue {
    LinkedList<Object> myQ = new LinkedList<>();

    private int size;

    int size() {
        return size;
    }

    void enqueue(Object element) {
        myQ.add(element);
    }

}
