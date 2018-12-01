package com.usman.practice.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class utils {
    public static void main(String[] args) {
        String greetings = "We Love Pakistan";
        System.out.println("Original String " + greetings);
        String revString = Arrays.stream(greetings.split(" ")).map(utils::reverseUsingSB).collect(Collectors.joining(" "));
        System.out.println("Reverse String's sub strings " + revString);
        System.out.println("Reverse String using char Array Method 1 " + revUsingChar1(greetings));
//        System.out.println("Reverse String using char Array Method 2 " + revUsingChar2(greetings));
        System.out.println("Reverse String using char Array Method 3 " + revUsingChar3("We love Pakistan"));
    }

    private static String reverseUsingSB(String token) {
        return new StringBuilder(token).reverse().toString();
    }

    private static String revUsingChar1(String string) {
        char[] charStr = string.toCharArray();
        StringBuilder revString = new StringBuilder();
        for (int i = charStr.length - 1; i >= 0; i--) {
            revString.append(charStr[i]);
        }
        return revString.toString();
    }

    private static String revUsingChar2(String string) {
        char[] charStr = string.toCharArray();
        for (int i = 0; i < charStr.length / 2; i++) {
            char temp = charStr[i];
            charStr[i] = charStr[charStr.length - i];
            charStr[charStr.length - i] = temp;
        }
        return new String(charStr);
    }

    private static String revUsingChar3(String string) {
        char[] charStr = string.toCharArray();
        int tokenBegIndex = 0;
        String revString = "";
        for (int i = 0; i < charStr.length; i++) {
            if (charStr[i] == ' ') {
                reverseCharArr(tokenBegIndex, i, charStr);
                tokenBegIndex = i + 1;
            }
        }
        return new String(charStr);
    }

    private static void reverseCharArr(int tokenBegIndex, int tokenSize, char[] charStr) {
        for (int i = tokenSize - 1; i > tokenBegIndex; i--) {
            char temp = charStr[i];
            charStr[i] = charStr[tokenSize - 1 - i];
            charStr[tokenSize - 1 - i] = temp;
        }
    }
}
