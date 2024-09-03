package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementCounterJava {
    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (Integer element : list) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        return elementCountMap;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(4);

        Map<Integer, Integer> result = countElements(list);
        System.out.println(result);
    }
}
