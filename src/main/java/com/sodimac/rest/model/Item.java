
package com.sodimac.rest.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Item {

	private String description;
	private BigDecimal porcentIva;
	private BigDecimal iva;
	private String percentDiscount;
	private String discountCode;
	private String discountGroup;
	private BigDecimal perUnitPrice;
	private BigDecimal providerCode;
	private BigDecimal providerNit;
	private BigDecimal quantity;
	private String sku;
	private BigDecimal totalDiscount;
	private BigDecimal totalPrice;
	private String uom;
	private BigDecimal volume;
	private BigDecimal weight;
	private BigDecimal shipmentId;
	private BigDecimal baseIva;
	private BigDecimal total;
	private String barCode;
	private String providerRef;
	private String departament;
	private String subDepartament;
	private String category;
	private boolean cit;
	private boolean transport;
	private boolean service;
	private boolean special;
}
