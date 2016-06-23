package com.tortialy.scew.dao;

import org.springframework.stereotype.Repository;

import com.tortialy.scew.data.model.OrdenDia;

@Repository
public class OrdenDiaDao extends AbstractJpaDao<OrdenDia> {

	public OrdenDiaDao(){
		super(OrdenDia.class);
	}
	
}
