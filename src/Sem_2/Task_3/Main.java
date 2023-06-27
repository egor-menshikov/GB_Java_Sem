package Sem_2.Task_3;



//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
//
//Палиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
public class Main {
    public static void main(String[] args) {
        String sentence = "abcfaaaafcba";

        System.out.println(pali(sentence));
    }

    public static boolean pali(String str) {
        boolean flag = true;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
