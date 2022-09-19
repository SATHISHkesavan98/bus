package com.bus.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {

	private Boolean checkedIn;
	private int numOfBags;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Bus bus;

	public Boolean getCheckedIn() {
		return checkedIn;
	}

	public int getNumOfBags() {
		return numOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public Bus getBus() {
		return bus;
	}

	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	@Override
	public String toString() {
		return "Reservation [checkedIn=" + checkedIn + ", numOfBags=" + numOfBags + ", passenger=" + passenger
				+ ", bus=" + bus + "]";
	}
}
