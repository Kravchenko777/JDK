package org.lessons.lesson6.seminar;

import com.google.common.collect.Lists;

import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> names = Lists.newArrayList("John", "Adam", "Jane", "Peter", "Max");

        List<String> reversed = Lists.reverse(names);
        System.out.println(reversed.toString());

        List<Character> characters = Lists.charactersOf(names.get(0));
        System.out.println(characters.toString());

        List<List<String>> result = Lists.partition(names, 3);
        System.out.println(result.toString());


    }
}
