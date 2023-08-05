package org.lessons.lesson4.home;

public class Main {

    public static void main(String[] args) {
        EmployeeCollection collection = new EmployeeCollection();

        System.out.println(collection.findByStag(12));

        System.out.println(collection.findByName("Max"));

        System.out.println(collection.findByNum(103));
    }
}
