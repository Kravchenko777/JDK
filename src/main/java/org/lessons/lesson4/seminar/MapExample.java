package org.lessons.lesson4.seminar;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, String> phoneFio = new HashMap<>();

        phoneFio.put("+7999999999", "Max");
        phoneFio.put("+7999999998", "Alen");
        phoneFio.put("+7999999990", "Gow");
        phoneFio.put("+7999999992", "Govard");
        phoneFio.put("+7999999993", "Michael");
        phoneFio.put("+7999999997", "David");

        System.out.println(phoneFio.get(Collections.min(phoneFio.keySet())));

        String name = Collections.max(phoneFio.values());

        for (Map.Entry<String, String> values: phoneFio.entrySet()) {
            if(values.getValue().equals(name)) System.out.println(values.getKey());
        }

    }
}
