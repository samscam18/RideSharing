package com.samscam18.ridesharing.controller;

import com.samscam18.ridesharing.model.Rider;
import com.samscam18.ridesharing.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/riders")
public class RiderController {
    @Autowired private RiderRepository riderRepository;

    @PostMapping("/register")
    public Rider registerNewRider(@RequestBody Rider newRider) {
        return riderRepository.save(newRider);
    }
}