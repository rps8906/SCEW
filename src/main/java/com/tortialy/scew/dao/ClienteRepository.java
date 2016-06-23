package com.tortialy.scew.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tortialy.scew.data.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
}
