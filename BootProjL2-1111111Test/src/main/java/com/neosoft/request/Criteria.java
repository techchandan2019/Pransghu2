package com.neosoft.request;

import java.util.List;

public class Criteria {
	
	private List<String> trailerNumbers;
	private Integer destination;
	private String status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
