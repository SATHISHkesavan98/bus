package com.bus.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
