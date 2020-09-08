
package com.sodimac.rest.model;

import lombok.Data;

@Data
public class PersonReceives {

	private String identificacion;
	private String name;
	private String lastName;
	private String email;
	private String phone;
	private Address address;
}