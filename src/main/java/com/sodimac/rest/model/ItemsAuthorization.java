package com.sodimac.rest.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ItemsAuthorization {
	private String sku;
	private BigDecimal realInventory;
	private BigDecimal reason;
	private BigDecimal quantity;
	
}
