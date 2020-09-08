package com.sodimac.rest.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class AuditoriaPrecioPromocion {
	
	private String sku;
	private BigDecimal precio;
	private String codigoDescuento;
	private String grupoDescuento;
	private BigDecimal porcentajeDescuento;
	private BigDecimal totalDescuento;
	private Date fecha;

}
