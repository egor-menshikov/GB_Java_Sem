package Lect_4;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Que_ue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(8);
        queue.add(12);
        System.out.println(queue);
        int num = queue.remove();
        int num2 = queue.poll();
        System.out.println(queue);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(4);
        pq.add(8);
        pq.add(2);
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.poll());
    }
}
