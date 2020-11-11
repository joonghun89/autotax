package com.hanul.autotax.common;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ErrorJsonMessage {
	
	String errorCd;
	String errorMsg;
	
	public ErrorJsonMessage(String errCd, String errMsg) {
		this.errorCd = errCd;
		this.errorMsg = errMsg;
	}
	
	public String toJson() {
		String json = null;
		ObjectMapper objectMapper = new ObjectMapper();		
		Map<String,String> msgMap = new HashMap();
		msgMap.put("errorCd", this.errorCd);
		msgMap.put("errorMsg", this.errorMsg);
		
		try {
			json = objectMapper.writeValueAsString(msgMap);
		}catch(Exception e) {
			json = "{\"errorCd\":\"999\",\"errorMsg\":\"서버오류\"}";
		}
		return json;
	}

}
