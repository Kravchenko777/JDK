package org.lessons.lesson4.home;

public class Employee {

    private Integer num;
    private String name;
    private String phone;
    private Integer stag;

    public Employee(Integer num, String name, String phone, Integer stag) {
        this.num = num;
        this.name = name;
        this.phone = phone;
        this.stag = stag;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", stag=" + stag +
                '}';
    }

    public Integer getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getStag() {
        return stag;
    }
}
