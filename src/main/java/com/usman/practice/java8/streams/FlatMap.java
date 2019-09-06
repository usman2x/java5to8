package com.usman.practice.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Usman", "25"));
        studentList.add(new Student("Ali", "24"));
        studentList.add(new Student("Ali 2", "24"));

        Map<String, List<Student>> stringListMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getAge, Collectors.toList()));

        System.out.println(stringListMap.entrySet().stream()
                .filter(stringListEntry -> stringListEntry.getKey().equals("24"))
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .filter(student -> student.getName().equals("Ali"))
                .findFirst().get());

    }

    public static class Student{
        private String name;
        private String Age;

        public Student(String name, String age) {
            this.name = name;
            Age = age;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return Age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", Age='" + Age + '\'' +
                    '}';
        }
    }
}
