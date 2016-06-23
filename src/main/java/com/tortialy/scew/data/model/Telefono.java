package com.tortialy.scew.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "telefono")
public class Telefono implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @NotNull
    @GeneratedValue
    @Column(name="id_telefono")
    private int idTelefono;
	
	@NotNull
	@Column(name = "num_telefono")
	private String telefono;
	
	@NotNull
	@Column(name="id_tipo")
	private int idTipo;
	
	

}
