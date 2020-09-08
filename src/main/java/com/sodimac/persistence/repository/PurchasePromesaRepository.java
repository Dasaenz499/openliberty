package com.sodimac.persistence.repository;

import com.sodimac.persistence.entity.PurchasePromesa;

public interface PurchasePromesaRepository {
	public PurchasePromesa findPromesa(String abreviatura, String idHorario, String condicion);
}
