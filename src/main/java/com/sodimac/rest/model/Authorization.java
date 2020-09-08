package com.sodimac.rest.model;

import java.util.List;

import lombok.Data;

@Data
public class Authorization {

	private Integer userId;
	private List<ItemsAuthorization> itemsAuthorization;
	private Integer manualFreight;
	private Integer reasonFreight;
	private Integer originalFreight;

}
