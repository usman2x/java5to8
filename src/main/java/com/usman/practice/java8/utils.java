package com.usman.practice.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class utils {
    public static void main(String[] args) {
        String greetings = "I Love Pakistan";
        System.out.println("Original String " + greetings);
        String revString = Arrays.stream(greetings.split(" ")).map(utils::reverse).collect(Collectors.joining(" "));
        System.out.println("Reverse String's sub strings " + revString);
        System.out.println("Reverse String using char Array Method 1 " + revUsingChar1(greetings));
        System.out.println("Reverse String using char Array Method 2 " + revUsingChar1(greetings));
    }

    private static String reverse(String token) {
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
            charStr[i] = charStr[charStr.length - 1];
            charStr[charStr.length - 1] = temp;
        }
        return new String(charStr);
    }
    private static String revUsingChar3(String string) {
        char[] charStr = string.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            if(charStr[i] == ' '){
                
            }
        }
    }
}
