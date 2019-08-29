package com.usman.practice.java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Streams are new feature in java 8, Before streams we used for loop, for each loop or iterator
 * to iterate over the collection or array i.e. this approach is called external iteration.
 * java 8 finally introduced a brand new way of iterating over collections, Streams are declarative
 * style and provide not just iteration power but aggregate operations over collections.
 * <p>
 * One thing to mention Streams are not a data structure to store data but uses underlying collection
 * to perform aggregate and iterate operations.
 * Streams provide two types of operations
 * 1) Intermediate operations
 * 2) Terminal operations
 * <p>
 * Intermediate operations are lazily evaluated, means streams do not evaluate intermediate operations
 * until it found terminal operation Instead of returning required result, intermediate operations just
 * return a new stream.
 * <p>
 * Various ways to create streams.
 * {@link Collection#stream}
 * {@link #getStringStream} method.
 * {@link #getIntStream} method.
 * <p>
 * We can't use Stream twice, Illegal State Exception
 * Lambda Expressions, Method Reference
 * Intermediate operations: map, filter, peek, boxed, sorted
 */
public class StreamApp {
    public static void main(String[] args) {
        StreamApp streamApp = new StreamApp();

        List<Fruit> fruitList = StreamUtils.getFruitList();

        List<String> fruitListNames1 = streamApp.getFruitListNames1(fruitList);
        List<String> fruitListNames2 = streamApp.getFruitListNames2(fruitList);
    }

    /**
     * How elegant ways to do same task in java 8, declarative way to get the list
     * of fruit names in just a single statement.
     *
     * @param fruitList list of fruits
     * @return only names of fruits in list
     */
    private List<String> getFruitListNames2(List<Fruit> fruitList) {
        return fruitList.stream().map(Fruit::getName).collect(Collectors.toList());
    }

    /**
     * Method returning name list of fruits without using java 8
     *
     * @param fruitList list of fruits
     * @return only names of fruit in list
     */
    private List<String> getFruitListNames1(List<Fruit> fruitList) {
        List<String> fruitListNames = new ArrayList<>();
        for (Fruit fruit : fruitList) {
            fruitListNames.add(fruit.getName());
        }
        return fruitListNames;
    }

    /**
     * @return String stream
     */
    private Stream<String> getStringStream() {
        return Stream.of("Apple", "Mango", "Banana");
    }

    /**
     * @return Integer type stream, Boxing is required, primitive type to non primitive type
     * boxed() is also an intermediate stream operation which returns new stream
     */
    private Stream<Integer> getIntStream() {
        return IntStream.of(2, 3, 4).boxed();
    }

    private Map<Taste, List<Fruit>> getFruitGroupByTaste(List<Fruit> fruitList) {
        return fruitList.stream()
                .collect(Collectors.groupingBy(Fruit::getTaste));
    }

}
