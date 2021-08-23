package com.example.a1h3;

public class country {
    private String country;
    private String city;
    private int image;

    public country(String country, String city, int image) {
        this.country = country;
        this.city = city;
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getImage() {
        return image;
    }
}
