package com.sodimac.persistence.repository.imp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sodimac.persistence.entity.ParamGral;
import com.sodimac.persistence.repository.ParamRepository;
@Stateless
public class ParamRepositoryImp implements ParamRepository {
	@PersistenceContext(unitName="unit-saps")
	private EntityManager em;
	@Override
	public ParamGral findById(String id) {

		ParamGral param = null;
		try {
			param = em.find(ParamGral.class, id);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return param;
	}

}
