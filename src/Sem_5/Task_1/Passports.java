package Sem_5.Task_1;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    Map<String, String> passports = new HashMap<>();

    void addNote(String num, String name) {
        passports.put(num, name);
    }

    String findByName(String name) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> item :
                passports.entrySet()) {
            String key = item.getKey();
            String val = item.getValue();
            if (val.equalsIgnoreCase(name))
                sb.append(key).append(" : ").append(val).append("\n");
        }
        return sb.toString();
    }
}
