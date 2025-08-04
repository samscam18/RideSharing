package com.samscam18.ridesharing.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Vehicle {
    private String model;
    private String licencePlate;
    private String type;

    public Vehicle() {}

    public Vehicle(String model, String licencePlate, String type) {
        this.model = model;
        this.licencePlate = licencePlate;
        this.type = type;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getLicencePlate() { return licencePlate; }
    public void setLicencePlate(String licencePlate) { this.licencePlate = licencePlate; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}