/**
 * Copyright 2013 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.common;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public enum ResponseCode
{
	/**
	 * Unknown error
	 */
	UNKNOWN_ERROR("1000", "Unknown error"),
	/**
	 * System error
	 */
	SYSTEM_ERROR("2000", "System Error contact sys admin"),

	/**
	 * Success
	 * */
	HTTP_SUCCESS_WITHOUT_ENTITY("204", "SUCCESS"),
	/**
	 * Success
	 * */
	HTTP_SUCCESS_POST("201", "SUCCESS"),

	/**
	 * Success
	 * */
	HTTP_SUCCESS_FETCH_WITHOUT_ETAG("200", "SUCCESS"),
	/**
	 * Failure
	 * */
	HTTP_ERROR_BUSINESS_RULE_WITH_ENTITY("400", "Failure due to invalid request of business rule violation"),

	/**
	 * returned when the requesting user is not authenticated or authorized to perform the given action
	 * */
	HTTP_USER_NOT_AUTHORIZED("401", "Requesting user is not authenticated or authorized to perform the given action"),

	
	/**
	 * returned when Coupon Web Service encountered an unexpected system error.
	 */
	HTTP_METHOD_NOT_ALLOWED("405", "Method not allowed"),

	/**
	 * when Coupon Web Service encountered an unexpected system error.
	 * */
	HTTP_UNEXPECTED_SYSTEM_ERROR("500", "Server encountered an unexpected system error"),

	/**
	 * IO_ERROR
	 * */
	IO_ERROR("2001", "Unable to communicate with external system"),
	
	PROCESSING_ERROR("2001", "Error processing api call"),
	/**
	 * NO_CONTENT
	 * */
	NO_CONTENT("2002", "Response contains no content"),

	/**
	 * NO_CONTENT
	 * */
	HTTP_ERROR("404", "Page not found"),

	/**
	 * Hotel list created
	 * */
	HTTP_HOTEL_LIST_CREATED("204", "Hotel list created"),
	/**
	 * Unexpected content type
	 */
	UNEXPECTED_CONTENT_TYPE("2003", "Unexpected content type");

	private static final EnumSet<ResponseCode> SUCCESSFUL_HTTP_CODES =
            EnumSet.of(
			ResponseCode.HTTP_SUCCESS_FETCH_WITHOUT_ETAG, ResponseCode.HTTP_SUCCESS_POST,
			ResponseCode.HTTP_SUCCESS_WITHOUT_ENTITY,ResponseCode.NO_CONTENT,ResponseCode.HTTP_HOTEL_LIST_CREATED);

	private static final EnumSet<ResponseCode> WHITELISTING_HTTP_CODES =
            EnumSet.of(ResponseCode.UNKNOWN_ERROR,
			ResponseCode.HTTP_UNEXPECTED_SYSTEM_ERROR, ResponseCode.HTTP_USER_NOT_AUTHORIZED,
			//ResponseCode.HTTP_ETAG_NOT_MATCH,
            ResponseCode.IO_ERROR);

    private String code;
    private String description;
    private String objectName;

    ResponseCode(String code, String description)
	{

		this.code = code;
		this.description = description;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	@Override
	public String toString()
	{
		return description + ":" + code.toString();
	}

	public String getObjectName()
	{
		return objectName;
	}

	public void setObjectName(String objectName)
	{
		this.objectName = objectName;
	}

	public static ResponseCode getResponseCode(String httpErrorCode)
	{
		ResponseCode[] responseCodes = ResponseCode.values();
		for (ResponseCode respCode : responseCodes)
		{
			if (respCode.getCode().equals(httpErrorCode))
			{
				return respCode;
			}
		}

		return ResponseCode.UNKNOWN_ERROR;
	}

	/*
	 * Determine whether response code is Success response code
	 */
	public static boolean isSuccessfulCode(ResponseCode responseCode)
	{
		return SUCCESSFUL_HTTP_CODES.contains(responseCode);
	}
	
	/*
	 * Determine whether response code is white listing error code or not
	 */
	public static boolean isWhiteListingErrorCode(ResponseCode responseCode)
	{
		return WHITELISTING_HTTP_CODES.contains(responseCode);
	}
	
	public static ResponseCode getResposeCodeByStatusCode(Integer statusCode){
		List<ResponseCode> responseCodes = Arrays.asList(ResponseCode.values());
		for(ResponseCode responseCode : responseCodes){
			if(Integer.parseInt(responseCode.getCode()) == statusCode){
				return responseCode;
			}
		}
		return null;
	}
	
}
