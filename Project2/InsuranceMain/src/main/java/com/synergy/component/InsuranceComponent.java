package com.synergy.component;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class InsuranceComponent {

	
	/*
	 *  way to communicate between two services.
	 */
	public JsonNode searchProviderBySearchText(String searchText){ // To search for Provider 
		System.out.println("Inside Rest Client");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> responseEntity = restTemplate.getForEntity("http://localhost:9090/searchProvider/"+searchText,Object.class);
		
		Object objects = responseEntity.getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode returnObj = mapper.convertValue(objects, JsonNode.class);
		
		return returnObj;
		
	}
	
	public JsonNode searchAutoModelAndMake(){ // To search for Provider 
		System.out.println("Inside Rest Client");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> responseEntity = restTemplate.getForEntity("http://localhost:9090/getAutoModel/",Object.class);
		
		Object objects = responseEntity.getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode returnObj = mapper.convertValue(objects, JsonNode.class);
		
		return returnObj;
		
	}
	
	public JsonNode searchInsurance(){ // To search for Provider 
		System.out.println("Inside Rest Client");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> responseEntity = restTemplate.getForEntity("http://localhost:9090/getIsuranceType/",Object.class);
		
		Object objects = responseEntity.getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode returnObj = mapper.convertValue(objects, JsonNode.class);
		
		return returnObj;
		
	}

	public JsonNode saveBooking(JsonNode json) {
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);        
        HttpEntity<String> request = new HttpEntity<String>(json.toString(), headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object> responseEntity = restTemplate.postForEntity("http://localhost:9921/saveBooking", request, Object.class);
        Object object = responseEntity.getBody();
        ObjectMapper mapper = new ObjectMapper();
		JsonNode responseObject = mapper.convertValue(object, JsonNode.class);
		return responseObject;
	}
	
	public JsonNode findBookingCurrentId(){ // To search for Provider 
		System.out.println("Inside Rest Client");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> responseEntity = restTemplate.getForEntity("http://localhost:9921/findBookingCurrent",Object.class);
		
		Object objects = responseEntity.getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode returnObj = mapper.convertValue(objects, JsonNode.class);
		
		return returnObj;
		
	}
	public JsonNode findBookingCancelledId(String status){ // To search for Provider 
		System.out.println("Inside Rest Client");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> responseEntity = restTemplate.getForEntity("http://localhost:9921/findCancelled"+status,Object.class);
		
		Object objects = responseEntity.getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode returnObj =  mapper.convertValue(objects, JsonNode.class);
		
		return returnObj;
		
	}
	public JsonNode findBookingCompletedId(String status){ // To search for Provider 
		System.out.println("Inside Rest Client");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> responseEntity = restTemplate.getForEntity("http://localhost:9921/findCompleted"+status,Object.class);
		
		Object objects = responseEntity.getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode returnObj = mapper.convertValue(objects, JsonNode.class);
		
		return returnObj;
		
	}
	public JsonNode cancelBooking(int bookingId){ // To search for Provider 
		System.out.println("Inside Rest Client");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> responseEntity = restTemplate.getForEntity("http://localhost:9921/cancelBooking"+bookingId,Object.class);
		
		Object objects = responseEntity.getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode returnObj = mapper.convertValue(objects, JsonNode.class);
		
		return returnObj;
		
	}
}
