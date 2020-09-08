package com.sodimac.rest.model;

import java.math.BigDecimal;
import java.util.Date;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import lombok.Data;

@Data
public class ItemS {
	@Schema(description = "Porcentaje de descuento", defaultValue = "0", example = "0", required = true)
	private String percentDiscount;
	@Schema(description = "Codigo de descuento", defaultValue = "0", example = "0", required = true)
	private String discountCode;
	@Schema(description = "Cantidad comprada del item", defaultValue = "1", example = "1", required = true)
	private BigDecimal quantity;
	@Schema(description = "Sku del producto", defaultValue = "101010", example = "101010", required = true)
	private String sku;
	@Schema(description = "Fecha de entrega", required = true)
	private Date dateOfDelivery;
	@Schema(description = "Tipo de entrega", defaultValue = "1", example = "1", required = true)
	private BigDecimal typeOfDelivery;
	@Schema(description = "Total de descuento", defaultValue = "0", example = "0", required = true)
	private BigDecimal totalDiscount;
}
