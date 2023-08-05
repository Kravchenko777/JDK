package org.lessons.lesson4.home;

import java.util.*;

public class EmployeeCollection {

    private Map<Integer, Employee> employeeMap = new HashMap<>();

    public EmployeeCollection() {
        employeeMap.put(100, new Employee(100, "Max", "11111", 10));
        employeeMap.put(101, new Employee(101, "Max", "22222", 12));
        employeeMap.put(102, new Employee(102, "David", "33333", 3));
        employeeMap.put(103, new Employee(103, "Toma", "444444", 6));
        employeeMap.put(104, new Employee(104, "Fox", "55555", 23));
        employeeMap.put(105, new Employee(105, "Adam", "66666", 13));
        employeeMap.put(106, new Employee(106, "Fox", "77777", 2));
    }

    public void addEmployee(Integer num, String name, String phone, Integer stag) {
        employeeMap.put(num, new Employee(num, name, phone, stag));
    }

    public Set<Employee> findByStag(Integer stag) {
        Set<Employee> result= new HashSet<>();
        for (Employee employee: employeeMap.values()) {
            if(employee.getStag().equals(stag)) result.add(employee);
        }

        return result;
    }

    public Set<String> findByName(String name) {
        Set<String> phone= new HashSet<>();
        for (Employee employee: employeeMap.values()) {
            if(employee.getName().equals(name)) phone.add(employee.getPhone());
        }

        return phone;
    }

    public Employee findByNum(Integer num) {
        return employeeMap.get(num);
    }
}
