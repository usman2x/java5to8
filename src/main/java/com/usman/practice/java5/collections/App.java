package com.usman.practice.java5.collections;

import com.usman.practice.model.Person;
import com.usman.practice.util.ModelUtil;
import com.usman.practice.util.PersonComparator;
import com.usman.practice.util.Utils;

import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> personList = ModelUtil.createPersonList();

        System.out.println("Before Sort.");
        Utils.showList(personList);

        Collections.sort(personList);
        System.out.println("After comparable Sort.");
        Utils.showList(personList);

        Collections.sort(personList, new PersonComparator());
        System.out.println("After comparator Sort.");
        Utils.showList(personList);
    }
}
