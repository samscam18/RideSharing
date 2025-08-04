package com.samscam18.ridesharing.model;

import jakarta.persistence.Entity;

@Entity
public class Rider extends User {
    private double rating;

    public Rider() {}

    public Rider(String name, String email) {
        super(name, email);
        this.rating = 5.0;
    }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
}