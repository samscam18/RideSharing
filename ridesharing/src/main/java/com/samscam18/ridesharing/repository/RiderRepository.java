package com.samscam18.ridesharing.repository;
import com.samscam18.ridesharing.model.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {}