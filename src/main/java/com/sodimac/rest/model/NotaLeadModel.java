package com.sodimac.rest.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class NotaLeadModel {
	private String numeroLead;
	private BigDecimal idAlmacen;
	private BigDecimal idCliente;
	private BigDecimal valor;
	private BigDecimal idEstado;
	private String tipoLead;
	private Date fecha;

}
