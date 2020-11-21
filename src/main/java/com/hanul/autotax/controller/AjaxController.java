package com.hanul.autotax.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hanul.autotax.common.ErrorJsonMessage;
import com.hanul.autotax.dao.CommonDao;

@RestController
@RequestMapping(value="/ajax")
public class AjaxController {
	private Logger logger = Logger.getLogger(AjaxController.class);
	
	@Autowired
	private CommonDao commonDao;
		
	
	@RequestMapping(value="getAllCustomer", method=RequestMethod.GET, produces = "application/json; charset=UTF-8")
	String getCustomerInfo() {
		String json = null;
		logger.debug("getAllCustomer call...");
		try {
			ObjectMapper objectMapper = new ObjectMapper();
									
			List results = (List)commonDao.getAllCustomer();		
			json = objectMapper.writeValueAsString(results);
			
		}catch(Exception e) {
			e.printStackTrace();
			json = new ErrorJsonMessage("A500","고객 정보 조회시 오류").toJson();	
			logger.debug(json);
		}
	
		return json;		
	}	
	
	@RequestMapping(value="/getCustomerById", produces = "application/json; charset=UTF-8")
	String getCustomerById(@RequestBody String jsonStr) {
		String json = null;
		logger.debug("param String : " + jsonStr);
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Map<String, String> map = objectMapper.readValue(jsonStr, Map.class);
						
			Map results = (Map)commonDao.getCustomerById(map);		
			json = objectMapper.writeValueAsString(results);
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		return json;		
	}
	
	@RequestMapping(value="/addNewCustomer")	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void addNewSalesPoint(@RequestBody String jsonStr) {
		logger.debug("param String : " + jsonStr);
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Map<String, String> map = objectMapper.readValue(jsonStr, Map.class);
			//commonDao.addNewCustomer(map);
	
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}	

}
