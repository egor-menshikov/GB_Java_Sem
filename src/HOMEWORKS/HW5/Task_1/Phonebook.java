package HOMEWORKS.HW5.Task_1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Phonebook {
    private final HashMap<String, LinkedList<String>> phonebook = new HashMap<>();

    public void addContact(String name, String number) {
        if (!phonebook.containsKey(name)) {
            LinkedList<String> phone = new LinkedList<>();
            phone.add(number);
            phonebook.put(name, phone);
        } else {
            phonebook.get(name).add(number);
        }
    }

    public void removeContact(String name) {
        phonebook.remove(name);
    }

    public void removePhone(String name, int index) {
        if (phonebook.containsKey(name) && phonebook.get(name).size() > index)
            phonebook.get(name).remove(index);
    }

    public void print() {
        for (Map.Entry<String, LinkedList<String>> item : phonebook.entrySet()) {
            System.out.printf("%s %s\n", item.getKey(), item.getValue());
        }
        System.out.println();
    }
}
