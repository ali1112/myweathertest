package com.test.entity;

import javax.ws.rs.core.Response;

import com.test.common.ResponseCode;

public class RestResponse {

	Response response;	
	
	ResponseCode responseCode;
	
	public Response getResponse() {
		return response;
	}
	
	public void setResponse(Response response) {
		this.response = response;
	}
	public ResponseCode getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	} 
	
	
}
