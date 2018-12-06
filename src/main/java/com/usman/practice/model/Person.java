package com.usman.practice.model;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {
    private String id;
    private String name;
    private int age;
    private String address;
    private Double height;
    private transient Address personalAddress;// This must be implemented as serializable to serialize object

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address, Double height) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.height = height;
    }

    public Person(String name, int age, Address address, Double height) {
        this.name = name;
        this.age = age;
        this.personalAddress = address;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}
