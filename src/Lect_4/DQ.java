package Lect_4;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQ {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(3);
        dq.add(5);
        dq.add(7);
        System.out.println(dq);
        dq.addFirst(1);
        System.out.println(dq);
        dq.offerFirst(12);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.peekLast());
    }
}
