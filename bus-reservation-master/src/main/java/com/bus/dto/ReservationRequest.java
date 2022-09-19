package com.bus.dto;

public class ReservationRequest {

	private Long busid;
	private String passengerFirstName;
	private String passengerLastName;
	private String passengerMiddleName;
	private String passengerEmail;
	private String passengerPhone;
	private String cardName;
	private String cardNo;
	private String expiryDate;
	private String securityCode;

	public Long getBusid() {
		return busid;
	}

	public void setBusid(Long busid) {
		this.busid = busid;
	}

	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	public String getPassengerLastName() {
		return passengerLastName;
	}

	public String getPassengerMiddleName() {
		return passengerMiddleName;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public String getPassengerPhone() {
		return passengerPhone;
	}

	public String getCardName() {
		return cardName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}

	public void setPassengerMiddleName(String passengerMiddleName) {
		this.passengerMiddleName = passengerMiddleName;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public String toString() {
		return "ReservationRequest [busid=" + busid + ", passengerFirstName=" + passengerFirstName
				+ ", passengerLastName=" + passengerLastName + ", passengerMiddleName=" + passengerMiddleName
				+ ", passengerEmail=" + passengerEmail + ", passengerPhone=" + passengerPhone + ", cardName=" + cardName
				+ ", cardNo=" + cardNo + ", expiryDate=" + expiryDate + ", securityCode=" + securityCode + "]";
	}

}
