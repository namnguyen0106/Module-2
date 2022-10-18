package day12.bt2;

import java.util.*;

public class UseMapToCount {
    public static void main(String[] args) {
        count("ahiha");
    }

    public static void count(String str) {
        String[] strArr = str.toUpperCase(Locale.ROOT).split("");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String s : strArr) {
            if (treeMap.containsKey(s)) {
                treeMap.replace(s, treeMap.get(s) + 1);
            } else {
                treeMap.put(s, 1);
            }
        }

        Set<String> stringSet = treeMap.keySet();
        for (String s : stringSet) {
            System.out.println("Key: " + s + "; value: " + treeMap.get(s));
        }
    }
}
