package com.sodimac.rest.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class HistoricoEstadoLeadModel {

	private String numeroLead;
	private BigDecimal idAlmacen;
	private Date fecha;
	private BigDecimal idEstado;

	public HistoricoEstadoLeadModel() {
		super();
	}

}
