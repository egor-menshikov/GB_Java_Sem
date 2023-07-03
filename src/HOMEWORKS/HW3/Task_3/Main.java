package HOMEWORKS.HW3.Task_3;

//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static List<String> planets = List.of(
            "Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
            "Neptune");

    public static void main(String[] args) {
        List<String> list = makeAList(10);
        System.out.println(list);
        System.out.println(countPlanets(list));
    }

    public static List<String> makeAList(int amount) {
        List<String> result = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < amount; i++) {
            result.add(planets.get(rd.nextInt(0, 8)));
        }
        return result;
    }

    public static String countPlanets(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String planet :
                planets) {
            sb.append(planet).append(" : ").append(Collections.frequency(list, planet)).append("\n");
        }
        return sb.toString();
    }
}
