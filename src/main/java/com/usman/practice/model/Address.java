package com.usman.practice.model;

import java.io.Serializable;

public class Address {
    private String home;
    private String city;
    private String state;
    private String country;
    private String latlang;

    public Address(String country) {
        this.country = country;
    }

    public Address(String home, String city, String state, String country, String latlang) {
        this.home = home;
        this.city = city;
        this.state = state;
        this.country = country;
        this.latlang = latlang;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatlang() {
        return latlang;
    }

    public void setLatlang(String latlang) {
        this.latlang = latlang;
    }

    @Override
    public String toString() {
        return "Address{" +
                "home='" + home + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latlang='" + latlang + '\'' +
                '}';
    }
}
