package com.neosoft.request.changeDestination;

import java.util.List;

public class ChangeDestinationRequest {
	
	private List<String> trailerNumbers;
	private Integer destination;
	private String deliveryNumber;
	public List<String> getTrailerNumbers() {
		return trailerNumbers;
	}
	public void setTrailerNumbers(List<String> trailerNumbers) {
		this.trailerNumbers = trailerNumbers;
	}
	public Integer getDestination() {
		return destination;
	}
	public void setDestination(Integer destination) {
		this.destination = destination;
	}
	public String getDeliveryNumber() {
		return deliveryNumber;
	}
	public void setDeliveryNumber(String deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}
	
	

}
