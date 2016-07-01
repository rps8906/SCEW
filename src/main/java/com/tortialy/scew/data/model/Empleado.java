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
@Table(name = "empleados")
public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@GeneratedValue
	@Column(name="clave_empleado")
	private int claveEmpleado;
	
	@NotNull
	@Column(name="id_usuario")
	private int idUsuario;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario" , insertable = false, updatable = false, nullable = false)
	private Usuario usuario;
	
	@NotNull
	@Column(name="nombre_empleado")
	private String nombreEmpleado;
	
	@NotNull
	@Column
	private String direccion;
	

}
