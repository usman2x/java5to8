package com.usman.practice.java8.streams;

public class Fruit {
    private String name;
    private Season season;
    private Taste taste;

    public Fruit(String name, Season season, Taste taste) {
        this.name = name;
        this.season = season;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", season=" + season +
                ", taste=" + taste +
                '}';
    }
}
