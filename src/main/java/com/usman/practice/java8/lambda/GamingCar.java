package com.usman.practice.java8.lambda;

public class GamingCar implements Car {

    @Override
    public void running(String carName) {
        System.out.println(this);
        System.out.println(carName + " is Running.");
        System.out.println();
    }

    public Car createRacingCarAnonymousClass() {
        return new Car() {
            @Override
            public void running(String carName) {
                System.out.println(this);
                System.out.println(carName + " is Running.");
                System.out.println();

                GamingCar.this.running("Car A");

//                this.running("....Accident......");
            }
        };
    }

    public Car createRacingCarLambda() {
        return (carName) -> {
            System.out.println(this);
            System.out.println(carName + " is Running.");
            System.out.println();

            this.running("Car A");
        };
    }
}
