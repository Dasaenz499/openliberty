package com.sodimac.persistence.repository;

import com.sodimac.persistence.entity.ParamGral;

public interface ParamRepository {
	public ParamGral findById(String id);
}
