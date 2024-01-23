package com.neosoft.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.request.Criteria;
import com.neosoft.request.Page;
import com.neosoft.request.TrailerRequest;
import com.neosoft.request.changeDestination.ChangeDestinationRequest;
import com.neosoft.request.delivery.DeliveryRequest;
import com.neosoft.response.delivery.GeneralResponse;
import com.neosoft.response.trailer.BasePageResponse;
import com.neosoft.response.trailer.BaseResponseForTrailer;
import com.neosoft.response.trailer.BpoInfoItem;
import com.neosoft.response.trailer.TrailerResponse;


@RestController
public class TestController {
	
	@PostMapping("/shipment/trailer-summary")
	public ResponseEntity<TrailerResponse> getTrailerInfo(@RequestBody TrailerRequest req){
		
		//dummy Trailer response
		TrailerResponse trailerResponse=new TrailerResponse();
		
		List<BaseResponseForTrailer> listBaseResponseForTrailers=new ArrayList<>();
		//Criteria value from request
		Criteria criteria=req.getCriteria();
		if(criteria.getTrailerNumbers()!=null) {
			for(String s:criteria.getTrailerNumbers()){
				//dummy baseResponse for trailer
				BaseResponseForTrailer baseResponseForTrailer=new BaseResponseForTrailer(); 
				baseResponseForTrailer.setTrailerNumber(s);
				baseResponseForTrailer.setScac_code("CMDU");
				baseResponseForTrailer.setDeliveryNumber(null);
				baseResponseForTrailer.setPo_type("40");
				baseResponseForTrailer.setAppointmentTime(null);
				baseResponseForTrailer.setDestination(1582);
				baseResponseForTrailer.setStatus("NCR");
				
				List<BpoInfoItem> listBpoInfoItems=new ArrayList<>();
				//create dummy bpo info items==============
				BpoInfoItem bpoInfoItem1=new BpoInfoItem();
				bpoInfoItem1.setBpo_number("9380051441");
				bpoInfoItem1.setQuantity(24);
				
				BpoInfoItem bpoInfoItem2=new BpoInfoItem();
				bpoInfoItem2.setBpo_number("9380051442");
				bpoInfoItem2.setQuantity(30);
				
			
				//==============
				baseResponseForTrailer.setBpo_info(Arrays.asList(bpoInfoItem1,bpoInfoItem2));
				
				
				//add this base response to List
				listBaseResponseForTrailers.add(baseResponseForTrailer);
			}
			//create basepage response
			BasePageResponse basePageResponse=new BasePageResponse();
			basePageResponse.setNumber(0);
			basePageResponse.setSize(25);
			basePageResponse.setNumberOfElements(2);
			basePageResponse.setTotalPages(1);	
			
			trailerResponse.setData(listBaseResponseForTrailers);
			trailerResponse.setPage(basePageResponse);
		}
		
		
		
		return new ResponseEntity(trailerResponse,HttpStatus.OK);
	}
	@PostMapping("/shipment/delivery-creation")
	public ResponseEntity<GeneralResponse> createDelivery(@RequestBody DeliveryRequest req){
		GeneralResponse response=new GeneralResponse();
		response.setStatus("success");
		response.setCode(200);
		response.setMessage("Delivery succesfully created");
		
		
		return new ResponseEntity(response,HttpStatus.OK);
	}
	@PostMapping("/shipment/change-destination")
	public ResponseEntity<GeneralResponse> changeDestination(@RequestBody ChangeDestinationRequest req){
		GeneralResponse response=new GeneralResponse();
		response.setStatus("success");
		response.setCode(200);
		response.setMessage("Destination changed succesfully");
		
		return new ResponseEntity(response,HttpStatus.OK);
	}

}
