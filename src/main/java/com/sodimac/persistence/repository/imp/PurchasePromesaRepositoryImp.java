package com.sodimac.persistence.repository.imp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.sodimac.persistence.entity.PurchasePromesa;
import com.sodimac.persistence.repository.PurchasePromesaRepository;

@Stateless
public class PurchasePromesaRepositoryImp implements PurchasePromesaRepository {
	@PersistenceContext(unitName = "unit-saps")
	private EntityManager em;
	@Override
	public PurchasePromesa findPromesa(String abreviatura, String idHorario, String condicion) {
		PurchasePromesa promesa = null;
		try {
			Query query = em.createNamedQuery("purchase.promesa.find", PurchasePromesa.class);
			query.setParameter("abreviatura", abreviatura);
			query.setParameter("idHorario", idHorario);
			query.setParameter("condicion", condicion);
			System.out.println(query.toString());
			promesa = (PurchasePromesa) query.getSingleResult();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return promesa;
	}

}
