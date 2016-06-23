package com.tortialy.scew.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class AbstractJpaDao<T extends Serializable> {
	
	private Class<T> class1;
	
	public AbstractJpaDao(Class<T> clazzToSet){
		this.class1 = clazzToSet;
	}
	
	@Getter
	@PersistenceContext
	private EntityManager entityManager;
	
	public T findOne(int id){
		return entityManager.find(class1, id);
	}
	
	public List<T> findAll(){
		return entityManager.createQuery("from " + class1.getName(),class1).getResultList();
	}
	
	public void create(T entity){
		entityManager.persist(entity);
	}
	
	public T update(T entity){
		return entityManager.merge(entity);
	}
	
	public void delete(T entity){
		entityManager.remove(entity);
	}
	
	public void deleteById(int entityId){
		T entity = findOne(entityId);
		delete(entity);
	}

}
