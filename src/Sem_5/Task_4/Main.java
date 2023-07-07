package Sem_5.Task_4;


import java.util.*;

//Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
//Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
public class Main {
    public static void main(String[] args) {
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        s = s.replace(",", "");
        s = s.replace("\n", " ");
        String[] words = s.split(" ");

        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());

        for (String word : words) {
            int len = word.length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
//        NavigableMap dmap = ((TreeMap<Integer, List<String>>) map).descendingMap();
        System.out.println(map);
    }
}
