package Sem_2.Task_2;

//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd.
//Результат: a4b3cd2
public class Main {
    public static void main(String[] args) {
        String text = "aaaabbbcd2";
        System.out.println(squeeze(text));
    }

    static String squeeze(String str) {
        int count = 1;
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) count++;
            else if (count > 1) {
                sb.append(chars[i - 1]).append(count);
                count = 1;
            }
            else {
                sb.append(chars[i - 1]);
                count = 1;
            }
        }
        sb.append(chars[chars.length - 1]);
        if (count != 1) sb.append(count);
        return sb.toString();
    }
}



/*
    Напишите метод, который сжимает строку.
    Пример: вход aaaabbbcdd.
    Результат: a4b3cd2
     */
//    public static void main(String[] args) {
//        String s = "aaaabbbcdd";
//        System.out.println(squeeze(s));
//    }
//
//    static String squeeze(String line) {
//        int count = 1;
//        char[] chars = line.toCharArray();
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 1; i < chars.length; i++) {
//            if (chars[i] == chars[i - 1]) {
//                count++;
//            } else {
//                stringBuilder.append(chars[i - 1]);
//                if (count != 1) {
//                    stringBuilder.append(count);
//                    count = 1;
//                }
//            }
//        }
//        stringBuilder.append(chars[chars.length - 1]);
//        if (count != 1) {
//            stringBuilder.append(count);
//        }
//        return stringBuilder.toString();
//    }
