package com.samscam18.ridesharing.controller;

import com.samscam18.ridesharing.model.Driver;
import com.samscam18.ridesharing.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {
    @Autowired private DriverRepository driverRepository;

    @PostMapping("/register")
    public Driver registerNewDriver(@RequestBody Driver newDriver) {
        return driverRepository.save(newDriver);
    }
}