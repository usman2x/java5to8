package com.usman.practice.util;

import com.usman.practice.model.Address;
import com.usman.practice.model.Person;

import java.util.ArrayList;
import java.util.List;

public class ModelUtil {
    public static List<Person> createPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Zulqi", 26, "Okara", 6.1));
        personList.add(new Person("Ali", 25, "Burewala", 6.5));
        personList.add(new Person("Taimorr", 24, "RYK", 5.8));
        personList.add(new Person("Talha", 24, "RYK", 5.7));
        personList.add(new Person("Usman", 27, "Sheikhupura", 6.1));
        return personList;
    }

    public static List<Person> createPersonListForSerialization() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Zulqi", 26, new Address("Okara"), 6.1));
        personList.add(new Person("Ali", 25, new Address("Burewala"), 6.5));
        personList.add(new Person("Taimorr", 24, new Address("RYK"), 5.8));
        personList.add(new Person("Talha", 24, new Address("RYK"), 5.7));
        personList.add(new Person("Usman", 27, new Address("Sheikhupura"), 6.1));
        return personList;
    }
}
