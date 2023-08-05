package org.lessons.lesson4.seminar;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Adam", "Jane", "Peter", "Max", "Tom", "Argentina");
        Collections.reverse(names);
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        Collections.sort(names, (u1,u2) -> u1.length() - u2.length());
        System.out.println(names);
    }
}
