package com.sodimac.rest.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class Lead {
	private BigDecimal id;
	private BigDecimal numeroLead;
	private List<ItemsLead> itemsLead;
	
}
