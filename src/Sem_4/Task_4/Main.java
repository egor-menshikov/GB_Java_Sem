package Sem_4.Task_4;

//1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
//        stack.push("1");
//        stack.push("2");
//        stack.push("3");
//        stack.push("4");
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
//        while (!queue.isEmpty())
//            System.out.println(queue.poll());
    }
}
