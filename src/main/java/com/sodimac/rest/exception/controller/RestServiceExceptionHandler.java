package com.sodimac.rest.exception.controller;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.google.gson.JsonObject;

@Provider
public final class RestServiceExceptionHandler implements ExceptionMapper<RestServiceException> {

//	@Inject
//	private Logger log;

	@Inject
	Event<Throwable> canalExcepciones;

	@Override
	public Response toResponse(RestServiceException exception) {
//		log.error("Excepcion restexception capturado ", exception);
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exception.printStackTrace(pw);
		exception.printStackTrace();
		String stackTrace = sw.toString().replaceAll(System.getProperty("line.separator"), "").replaceAll("\t", "");
		JsonObject respError = new JsonObject();
		respError.addProperty("code", -1);
		respError.addProperty("message",stackTrace);
		return Response.serverError().entity(respError.toString()).build();
	}

}