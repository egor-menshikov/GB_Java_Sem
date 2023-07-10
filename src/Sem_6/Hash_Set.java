package Sem_6;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(null);
        set.remove(null);
        System.out.println(set.contains(null));
        System.out.println(set.size());

    }
}
