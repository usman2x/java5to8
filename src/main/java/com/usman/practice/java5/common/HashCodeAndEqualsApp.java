package com.usman.practice.java5.common;

import com.usman.practice.model.Person;

public class HashCodeAndEqualsApp {
    public static void main(String[] args) {
        Person person1 = new Person("1", "Usman", 25);
        Person person2 = new Person("1", "Usman", 25);
        Person person3 = new Person("2", "Junaid", 25);

        //These two objects are uniquely identified by id, if we don't
        //provide .equals() implementation this will give us "person1 == person2 ? false"
        //Because .equals() is the method of Object class and all the
        //other classes are inherited from Object.java so the default implementation gives
        //us only comparison of references (if two objects are refer to same object in memory location)
        System.out.println("person1 == person2 ? " + person1.equals(person2));

        System.out.println("person1 == person3 ? " + person1.equals(person3));
    }
}
