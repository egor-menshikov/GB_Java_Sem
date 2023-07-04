package Sem_4.Task_5;

public class MyStack {
    String[] arr = new String[10];
    private int size;

    int size() {
        return size;
    }

    boolean empty() {
        return size == 0;
    }

    void push(String item) {
        if (size >= arr.length) {
            String[] arr2 = new String[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = item;
    }

    String peek() {
        if (empty()) return null;
        return arr[size - 1];
    }

    String pop() {
        if (empty()) return null;
        String result = arr[size - 1];
        String[] arr2 = new String[arr.length - 1];
        System.arraycopy(arr, 0, arr2, 0, arr.length - 1);
        arr = arr2;
        size--;
        return result;
    }
}
