package com.sodimac.rest.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CashBackBonus {
	private BigDecimal codeNumber;
	private BigDecimal value;
	private BigDecimal reservationId;
	private String deviceId;
}
