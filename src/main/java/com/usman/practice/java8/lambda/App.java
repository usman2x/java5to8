package com.usman.practice.java8.lambda;

public class App {
    public static void main(String[] args) {

        Greetings greetingsInterface = new GreetingsImp();
        System.out.println("Interface Greeting");
        greetingsInterface.greet("Good Morning");

        System.out.println("Anonymous class Greeting");
        Greetings greetingsAnon = new Greetings() {
            public void greet(String message) {
                System.out.println("Greetings: " + message);
            }
        };
        greetingsAnon.greet("Good evening");

        System.out.println("Lambda Greeting");
        Greetings greetingsLambda = message -> System.out.println("Greetings" + message);
        greetingsLambda.greet("Good Noon");


    }
}
