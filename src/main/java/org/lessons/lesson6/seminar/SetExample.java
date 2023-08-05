package org.lessons.lesson6.seminar;

import com.google.common.collect.Sets;

import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<Character> first = Set.of('a', 'b', 'c');
        Set<Character> second = Set.of('b', 'c', 'd');

        Set<Character> union = Sets.union(first, second);
        System.out.println(union.toString());

        Set<Character> intersection = Sets.intersection(first, second);
        System.out.println(intersection.toString());

        Set<Character> difference = Sets.symmetricDifference(first, second);
        System.out.println(difference.toString());
    }
}
