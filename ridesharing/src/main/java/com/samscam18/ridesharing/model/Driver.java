package com.samscam18.ridesharing.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
public class Driver extends User {
    @Embedded
    private Vehicle vehicle;
    private boolean isAvailable;

    public Driver() {}

    public Driver(String name, String email, Vehicle vehicle) {
        super(name, email);
        this.vehicle = vehicle;
        this.isAvailable = true;
    }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
}