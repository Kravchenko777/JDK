package org.lessons.lesson4.seminar;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Adam", "Jane", "Peter", "Max", "Tom", "Argentina", "Adam", "Jane");

        Set<String> namesSet = new HashSet<>(names);

        System.out.println(Collections.max(namesSet, (u1,u2) -> u2.length() - u1.length()));
        System.out.println(Collections.min(namesSet));

        Set<String> result = new HashSet<>();
        for (String str: namesSet) {
            if(!str.contains("A")) result.add(str);
        }

        System.out.println(result.toString());

    }
}
