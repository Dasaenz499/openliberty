package com.sodimac.business.service;

import com.sodimac.rest.exception.controller.RestServiceException;
import com.sodimac.rest.model.Order;

public interface ShipmentService {
	public void addInfoShipment(Order order) throws RestServiceException;
}
