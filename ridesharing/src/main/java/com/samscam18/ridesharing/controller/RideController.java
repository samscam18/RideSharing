package com.samscam18.ridesharing.controller;

import com.samscam18.ridesharing.model.Ride;
import com.samscam18.ridesharing.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rides")
public class RideController {
    @Autowired private RideService rideService;

    @PostMapping("/request")
    public Ride requestRide(@RequestBody RideRequest request) {
        return rideService.requestRide(request.getRiderId(), request.getPickupLocation());
    }
}

class RideRequest {
    private Long riderId;
    private String pickupLocation;

    public Long getRiderId() { return riderId; }
    public void setRiderId(Long riderId) { this.riderId = riderId; }
    public String getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }
}