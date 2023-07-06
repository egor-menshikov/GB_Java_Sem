package HOMEWORKS.HW4.Task_2;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyQueue myQ = new MyQueue();
        System.out.println(myQ.size());
        LinkedList<Integer> list = new LinkedList<>();
    }
}
