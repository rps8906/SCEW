package com.tortialy.scew.dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tortialy.scew.data.model.ClienteTelefono;

@Repository
public class ClienteTelefonoDao extends AbstractJpaDao<ClienteTelefono>{
	
	public ClienteTelefonoDao(){
		super(ClienteTelefono.class);
	}
	
	public ClienteTelefono findByTelefono(final String telefono){
		try{
			final TypedQuery<ClienteTelefono> query = this.getEntityManager().createNamedQuery("ClienteTelefono.findByTelefono", 
					ClienteTelefono.class);
			query.setParameter("telefono", telefono);
			return query.getSingleResult();
		}catch(NoResultException e){
			return null;
		}
	}
}
