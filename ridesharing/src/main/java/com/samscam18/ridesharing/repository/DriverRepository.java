package com.samscam18.ridesharing.repository;
import com.samscam18.ridesharing.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {}