package com.usman.practice.model;
import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {
    private String name;
    private int age;
    private String address;
    private Double height;

    public Person(String name, int age, String address, Double height) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}
