package com.sodimac.persistence.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PURCHASE_PROMESA")
@NamedQuery(name = "purchase.promesa.find", 
query = "select u from PurchasePromesa u where u.abreviatura=:abreviatura and u.idHorario=:idHorario and (u.condicion=:condicion or u.condicion is null)")
@Data
public class PurchasePromesa {
	@Id
	@Column(name = "ID_PROMESA_CLIENTE")
	private BigDecimal idPromesaCliente;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "ABREVIATURA")
	private String abreviatura;
	@Column(name = "ID_HORARIO")
	private String idHorario;
	@Column(name = "CONDICION")
	private String condicion;

}
