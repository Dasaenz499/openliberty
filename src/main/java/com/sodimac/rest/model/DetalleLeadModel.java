package com.sodimac.rest.model;

import java.math.BigDecimal;

import lombok.Data;

@Data

public class DetalleLeadModel {

	private String numeroLead;
	private String numeroServicio;
	private String sku;
	private BigDecimal cantidad;
	private BigDecimal precio;
	private BigDecimal costo;
	private String estado;

	public DetalleLeadModel() {
		super();
	}

}
