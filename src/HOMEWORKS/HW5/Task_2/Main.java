package HOMEWORKS.HW5.Task_2;

import java.util.*;

//Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена с количеством
//повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

// Что-то я замучался на этой задаче, все равно не понял как требовалось ее решать.
public class Main {
    public static void main(String[] args) {
        String namesStr = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин," +
                " Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина," +
                " Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        TreeMap<String, Integer> countedNames = countNames(namesStr);
        System.out.println(countedNames + "\n");
        nameSort(countedNames);
    }

    public static TreeMap<String, Integer> countNames(String input) {
        String[] fullNames = input.split(", ");
        TreeMap<String, Integer> counter = new TreeMap<>();
        for (String fullName :
                fullNames) {
            String name = fullName.split(" ")[0];
            if (!counter.containsKey(name))
                counter.put(name, 1);
            else
                counter.put(name, counter.get(name) + 1);
        }
        return counter;
    }

    public static void nameSort(TreeMap<String, Integer> map) {
        TreeMap<Integer, LinkedList<String>> result = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!result.containsKey(entry.getValue())) {
                LinkedList<String> names = new LinkedList<>();
                names.add(entry.getKey());
                result.put(entry.getValue(), names);
            } else
                result.get(entry.getValue()).add(entry.getKey());
        }
        System.out.println(result.descendingMap());
    }
}

