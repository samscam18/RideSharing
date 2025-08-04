package com.samscam18.ridesharing.repository;
import com.samscam18.ridesharing.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {}