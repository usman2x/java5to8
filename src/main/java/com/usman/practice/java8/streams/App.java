package com.usman.practice.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> fruitList = Arrays
                .asList("Orange", "Apple", "Mango", "Dates", "Pomegranate", "Peach");

        String fruits = fruitList.stream().collect(Collectors.joining(","));
        System.out.println("Fruits: " + fruits);

        String sortedFruits = fruitList.stream().sorted().collect(Collectors.joining(","));
        System.out.println("Sorted Fruits :" + sortedFruits);

        Map<Season, List<Fruit>> fruitGroupBySeason = StreamUtils.getFruitList()
                .stream()
                .collect(Collectors.groupingBy(Fruit::getSeason));
        BiConsumer<Season, List<Fruit>> seasonListBiConsumer = (season, fruits1) -> {
            System.out.println(season);
            System.out.print(fruits1
                    .stream()
                    .map(Fruit::getName)
                    .collect(Collectors.joining(",")));
            System.out.println();
        };
        fruitGroupBySeason.forEach(seasonListBiConsumer);


        Map<Taste, List<Fruit>> fruitGroupByTaste = StreamUtils.getFruitList()
                .stream()
                .collect(Collectors.groupingBy(Fruit::getTaste));
        BiConsumer<Taste, List<Fruit>> tasteListBiConsumer = (taste, fruits1) -> {
            System.out.println(taste);
            System.out.print(fruits1
                    .stream()
                    .map(Fruit::getName)
                    .collect(Collectors.joining(",")));
            System.out.println();
        };
        fruitGroupByTaste.forEach(tasteListBiConsumer);

    }
}
