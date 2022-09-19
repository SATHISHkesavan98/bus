package com.bus.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bus.entities.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

	@Query("from Bus where departureCity=:departureCity and arrivalCity=:arrivalCity and "
			+ "dateOfDeparture=:dateOfDeparture")
	List<Bus> findBuses(@Param("departureCity")String from, @Param("arrivalCity")String to,
			@Param("dateOfDeparture")Date departureDate);

//	@Query("from Bus where departureCity := departureCity and arrivalCity := arrivalCity and"
//			+ "dateOfDeparture := dateOfDeparture")
//	List<Bus> findBuses(@Param("departureCity") String from, @Param("arrivalCity") String to,
//			@Param("dateOfDeparture") Date departureDate);

}
