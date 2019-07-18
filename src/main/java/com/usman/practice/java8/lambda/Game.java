package com.usman.practice.java8.lambda;

public class Game {
    public static void main(String[] args) {
        GamingCar car = new GamingCar();
        car.running("Car A");
        car.createRacingCarAnonymousClass().running("Car B");
        car.createRacingCarLambda().running("Car C");
    }
}
