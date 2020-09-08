package com.sodimac.rest.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class PaymentMethod {
	private String type;
	private BigDecimal total;
	private String authorizationCode;
	private String transactionDate;
	private String cardNumber;
}
