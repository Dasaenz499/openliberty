package com.sodimac.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="PARAM_GRAL")
@Data
public class ParamGral {
	@Id
	@Column(name="ID_PARAM_GRAL")
	private String id;
	@Column(name="VALUE")
	private String value;
	

}
