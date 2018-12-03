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
        sortArray(new int[]{4, 43, 3, 40, 42, 1});

    }

    /*How does Sorting works
    1. First apply condition
    2. Swap on the basis of condition
    */
    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    swap(i, j, arr);
                }
            }
        }
        for (int anArr : arr) {
            System.out.println(anArr);
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
