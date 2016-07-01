package com.tortialy.scew.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "roles")
public class Rol implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	@GeneratedValue
	@Column(name="id_rol")
	private int idRol;

	@NotNull
	@Column(name="id_usuario")
	private int idUsuaario;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario" , insertable = false, updatable = false, nullable = false)
	private Usuario usuario;
	
	@NotNull
	@Column
	private String rol;

}
