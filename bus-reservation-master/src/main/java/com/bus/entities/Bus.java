package com.bus.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Bus extends AbstractEntity {

	private String busNumber;
	private String busCompany;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartureTime;

	public String getBusNumber() {
		return busNumber;
	}

	public String getBusCompany() {
		return busCompany;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public void setBusCompany(String busCompany) {
		this.busCompany = busCompany;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", busCompany=" + busCompany + ", departureCity=" + departureCity
				+ ", arrivalCity=" + arrivalCity + ", dateOfDeparture=" + dateOfDeparture + ", estimatedDepartureTime="
				+ estimatedDepartureTime + "]";
	}
}
