package com.neosoft.response.trailer;

import java.util.List;

public class BaseResponseForTrailer {
	
	private String trailerNumber;
	private String scac_code;
	private String deliveryNumber;
	private String po_type;
	private String appointmentTime;
	private Integer destination;
	private String status;
	private List<BpoInfoItem> bpo_info;
	
	
	public String getTrailerNumber() {
		return trailerNumber;
	}
	public List<BpoInfoItem> getBpo_info() {
		return bpo_info;
	}
	public void setBpo_info(List<BpoInfoItem> bpo_info) {
		this.bpo_info = bpo_info;
	}
	public void setTrailerNumber(String trailerNumber) {
		this.trailerNumber = trailerNumber;
	}
	public String getScac_code() {
		return scac_code;
	}
	public void setScac_code(String scac_code) {
		this.scac_code = scac_code;
	}
	public String getDeliveryNumber() {
		return deliveryNumber;
	}
	public void setDeliveryNumber(String deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}
	public String getPo_type() {
		return po_type;
	}
	public void setPo_type(String po_type) {
		this.po_type = po_type;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
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
