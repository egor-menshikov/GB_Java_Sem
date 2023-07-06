package Lectures.Lect_5;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.TreeMap;

public class TMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"one");
        tMap.put(4,"two");
        tMap.put(5,"three");
        tMap.put(3,"four");
        tMap.put(2,"five");
        System.out.println(tMap);
        System.out.println(tMap.descendingMap().tailMap(3));
        System.out.println(tMap.descendingKeySet());
        System.out.println(tMap.tailMap(3));
        System.out.println(tMap.headMap(3, true));
        System.out.println(tMap.lastEntry());
        System.out.println(tMap.firstEntry());
    }
}
