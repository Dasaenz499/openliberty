package com.sodimac.business.service.imp;

import java.math.BigDecimal;
//test
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.sodimac.business.service.ShipmentService;
import com.sodimac.persistence.repository.PurchasePromesaRepository;
import com.sodimac.rest.exception.controller.RestServiceException;
import com.sodimac.rest.model.Order;
import com.sodimac.rest.model.Shipment;
import com.sodimac.rest.util.Statics;
@Stateless
public class ShipmentServiceImp implements ShipmentService {

	@Inject
	private PurchasePromesaRepository purchasePromesaRepo;

	@Override
	public void addInfoShipment(Order order)throws RestServiceException{		
		for(Shipment x:order.getShipments()) {
			BigDecimal idPromesaCliente;
			try {
				idPromesaCliente = purchasePromesaRepo.findPromesa(x.getShippingMethod(), x.getTimeRange().getId(),
						validateConditionalTime(x.getDateOfDelivery())).getIdPromesaCliente();
				x.setIdShippingMethod(idPromesaCliente);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RestServiceException("Error consultando purchase_promesa. ",e);
			}
		}
		order.getPersonReceives().setName(this.validateCustomerData(order.getPersonReceives().getName()));
		order.getPersonReceives().setLastName(this.validateCustomerData(order.getPersonReceives().getLastName()));
		
	}
	private String validateConditionalTime(String time) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(Statics.FORMAT_DATE);
		Date date = format.parse(time);
		String condicion = null;
		if (date.after(new Date())) {
			condicion = ">";
		} else {
			condicion = "<=";
		}
		return condicion;
	}
	
	private String validateCustomerData(String text){
		String validatedText = null;
		if(text != null && !text.isEmpty() && text.length() > 60) {
			validatedText = text.substring(0, 57) + "...";
		}else {
			validatedText = text;
		}
		return validatedText;
	}

}
