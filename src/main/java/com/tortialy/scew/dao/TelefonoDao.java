package com.tortialy.scew.dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import com.tortialy.scew.data.model.Telefono;

public class TelefonoDao extends AbstractJpaDao<Telefono>{
	
	public TelefonoDao(){
		super(Telefono.class);
	}
	
	public Telefono findByNumTelefono(String telefono){
		try{
			final TypedQuery<Telefono> query = this.getEntityManager().createNamedQuery("Telefono.findByTelefono", 
					Telefono.class);
			query.setParameter("telefono", telefono);
			return query.getSingleResult();
		}catch(NoResultException e){
			return null;
		}
	}

}
