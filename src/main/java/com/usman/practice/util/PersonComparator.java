package com.usman.practice.util;

import com.usman.practice.model.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Comparator.comparingInt(Person::getAge)
                .thenComparingDouble(Person::getHeight)
                .compare(o1, o2);
    }
}
