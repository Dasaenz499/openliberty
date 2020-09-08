
package com.sodimac.rest.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Shipment {

	private BigDecimal id;
	private String dateOfInitialDelivery;
	private String dateOfDelivery;
	private String dateOfPicking;
	private String dateOfShipping;
	private BigDecimal idStoreShipment;
	private BigDecimal idStoreSource;
	private BigDecimal idShippingMethod;
	private BigDecimal pickUpInStore;
	private String shippingMethod;
	private String idRedZone;
	private TimeRange timeRange;
	private BigDecimal childLastNode;
	private String enlistmentDate;
	private String sigla;
	private BigDecimal idDeliveryType;
	
	private ShipmentReceiver shipmentReceiver;
}