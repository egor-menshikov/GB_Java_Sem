package Lectures.Lect_4;

import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.add(7);
        ll.add(5);
        System.out.println(ll);
        System.out.println(ll.indexOf(7));
        LinkedList<Integer> l2 = new LinkedList<Integer>(ll.subList(1,3));
        System.out.println(l2);
        ll.removeAll(l2);
        System.out.println(ll);
    }
}
