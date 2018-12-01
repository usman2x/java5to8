package com.usman.practice.util;

import java.util.List;

public class Utils {
    public static <T> void showList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
