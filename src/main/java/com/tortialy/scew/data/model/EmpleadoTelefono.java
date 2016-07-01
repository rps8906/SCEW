package com.tortialy.scew.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "empleado_telefono")
@NoArgsConstructor
@NamedQueries({
	@NamedQuery(name = "EmpleadoTelefono.findByTelefono", query = "SELECT et FROM EmpleadoTelefono et WHERE telefono.telefono = :telefono")
})
public class EmpleadoTelefono implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull
	@Column(name = "clave_empleado")
	private int claveEmpleado;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "clave_empleado", referencedColumnName = "clave_empleado", insertable = false, updatable = false, nullable = false)
	private Empleado empleado;
	
	@Id
	@NotNull
	@Column(name = "id_telefono")
	private int idTelefono;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_telefono", referencedColumnName = "id_telefono" , insertable = false, updatable = false, nullable = false)
	private Telefono telefono;
}
