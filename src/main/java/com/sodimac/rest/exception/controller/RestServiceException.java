package com.sodimac.rest.exception.controller;

import java.io.Serializable;

public class RestServiceException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected int code = 501;

	public RestServiceException() {
		super();
	}

	public RestServiceException(String msg) {
		super(msg);
	}

	public RestServiceException(String msg, Exception e) {
		super(msg, e);
	}

	public RestServiceException(int code, String msg) {
		super(msg);
		this.code = code;
	}

	public RestServiceException(int code, String msg, Exception e) {
		super(msg, e);
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	
	
}
