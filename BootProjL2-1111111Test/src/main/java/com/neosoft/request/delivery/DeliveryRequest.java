package com.neosoft.request.delivery;

import java.util.List;

public class DeliveryRequest {

	private List<String> trailerNumbers;
	private Integer destination;
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
	
	
}
