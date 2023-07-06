package HOMEWORKS.HW4.Task_2;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class Main {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        int a = 13;
        mq.enqueue(a);
        mq.enqueue("14");
    }
}
