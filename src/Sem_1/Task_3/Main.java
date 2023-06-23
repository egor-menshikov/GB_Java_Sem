package Sem_1.Task_3;

//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

public class Main {
    public static void main(String[] args) {
        String text = "Добро пожаловать на курс по Java";
        System.out.println(rev(text));
    }

    static String rev(String line) {
        StringBuilder result = new StringBuilder();
        String[] text = line.split(" ");
        for (int i = text.length - 1; i >= 0; i--) {
            result.append(text[i]).append(" ");
        }
        return result.toString();
    }
}
