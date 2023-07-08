package HOMEWORKS.HW4.Task_2;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class MyQueue {
    private final LinkedList<Object> myQ = new LinkedList<>();

    void enqueue(Object item) {
        myQ.add(item);
    }

    Object dequeue() {
        return myQ.pollFirst();
    }

    Object first() {
        return myQ.peekFirst();
    }

    void print() {
        for (Object item : myQ) {
            System.out.printf("%s ", item);
        }
        System.out.println("\n");
    }
}
