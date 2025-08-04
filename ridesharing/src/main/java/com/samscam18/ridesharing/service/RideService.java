package com.samscam18.ridesharing.service;

import com.samscam18.ridesharing.model.*;
import com.samscam18.ridesharing.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideService {
    @Autowired private RideRepository rideRepository;
    @Autowired private DriverRepository driverRepository;
    @Autowired private RiderRepository riderRepository;

    public Ride requestRide(Long riderId, String pickupLocation) {
        Rider rider = riderRepository.findById(riderId)
                .orElseThrow(() -> new RuntimeException("Rider not found with id: " + riderId));

        Driver availableDriver = driverRepository.findAll().stream()
                .filter(Driver::isAvailable)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No available drivers found."));

        Ride newRide = new Ride();
        newRide.setRider(rider);
        newRide.setDriver(availableDriver);
        newRide.setPickupLocation(pickupLocation);
        newRide.setStatus(RideStatus.REQUESTED);

        return rideRepository.save(newRide);
    }
}