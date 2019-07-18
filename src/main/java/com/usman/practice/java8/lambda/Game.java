package com.usman.example.kafka.kafkasample.lamda;

public class Game {
    public static void main(String[] args) {
        GamingCar car = new GamingCar();
        car.running("Car A");
        car.createRacingCarAnonymousClass().running("Car B");
        car.createRacingCarLambda().running("Car C");
    }
}
