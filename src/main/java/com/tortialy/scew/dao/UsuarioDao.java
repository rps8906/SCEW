package com.tortialy.scew.dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tortialy.scew.data.model.Usuario;

@Repository
public class UsuarioDao  extends AbstractJpaDao<Usuario>{
	
	public UsuarioDao(){
		super(Usuario.class);
	}
	
	public Usuario findByUsername(String username){
		try{
			final TypedQuery<Usuario> namedQuery = this.getEntityManager().createNamedQuery("Usuario.findByUsername", Usuario.class);
			namedQuery.setParameter("username", username);
			return namedQuery.getSingleResult();
		}catch(NoResultException e){
			return null;
		}
	}
	
	public boolean isUserRegister(String username) {
		return findByUsername(username) != null? true: false;		
	}
}
