package com.bus.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
