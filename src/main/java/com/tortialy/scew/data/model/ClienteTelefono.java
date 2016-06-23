package com.tortialy.scew.data.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
@Table(name = "cliente_telefono")
@NoArgsConstructor
@NamedQueries({
	@NamedQuery(name = "ClienteTelefono.findByTelefono", query = "SELECT ct FROM ClienteTelefono ct WHERE telefono.telefono = :telefono")
})
public class ClienteTelefono implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull
	@Column(name = "id_cliente")
	private int idCliente;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false, nullable = false)
	private Cliente cliente;
	
	@Id
	@NotNull
	@Column(name = "id_telefono")
	private int idTelefono;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_telefono", referencedColumnName = "id_telefono" , insertable = false, updatable = false, nullable = false)
	private Telefono telefono;
}
