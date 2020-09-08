package com.sodimac.rest.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ServicioNotaLeadModel {

	private String numeroLead;
	private String numeroServicio;
	private BigDecimal valor;
	private BigDecimal idEstado;
	private String respuestaCentah;
	public ServicioNotaLeadModel() {
		super();
	}
}
