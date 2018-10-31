package com.usman.practice.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamUtils {
    public static List<Fruit> getFruitList() {
        return Arrays.asList(new Fruit("Mango", Season.SUMMER, Taste.SWEET)
                , new Fruit("Orange", Season.WINTER, Taste.SALTY)
                , new Fruit("Grapes", Season.SUMMER, Taste.SWEET)
                , new Fruit("Dates", Season.WINTER, Taste.SWEET)
                , new Fruit("Water Melon", Season.SUMMER, Taste.SWEET)
                , new Fruit("Guava", Season.SUMMER, Taste.SWEET)
                , new Fruit("Pomegranate", Season.SUMMER, Taste.BITTER));
    }
}
