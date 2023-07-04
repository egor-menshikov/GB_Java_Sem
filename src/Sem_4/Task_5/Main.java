package Sem_4.Task_5;

//Реализовать стэк с помощью массива.
//Нужно реализовать методы:
//size(), empty(), push(), peek(), pop().

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(Arrays.toString(stack.arr));
    }
}
