package com.sodimac.rest.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.sodimac.business.service.ShipmentService;
import com.sodimac.rest.exception.controller.RestServiceException;
import com.sodimac.rest.model.Order;

@Path("/Shipment")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ShipmentController {
	@Inject
	private ShipmentService service;

	@POST
	@Path("/getInfoShipments")
	public Response getInfoItems(Order order) throws RestServiceException{
		service.addInfoShipment(order);
		return Response.ok(order).build();
	}

}
