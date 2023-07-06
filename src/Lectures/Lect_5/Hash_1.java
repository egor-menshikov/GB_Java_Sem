package Lectures.Lect_5;


import java.util.HashMap;
import java.util.Map;


public class Hash_1 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>(9,0.75f);
        db.putIfAbsent(1, "one");
        db.put(4, "two");
        db.put(13, "three");
        System.out.println(db.containsValue("two"));
        System.out.println(db.keySet());
        db.remove(4);
        System.out.println(db.get(1));
        System.out.println(db.entrySet());
        System.out.println(db);
        printHashMap(db);
    }

    private static void printHashMap(Map<Integer, String> db) {
        for (var item :
                db.entrySet()) {
            System.out.printf("%d %s\n", item.getKey(), item.getValue());
        }
    }
}