package com.tortialy.scew.data.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "clientes")
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @NotNull
    @GeneratedValue
    @Column(name = "id_cliente")
    private int idCliente;
	
	@NotNull
	@Column(name = "nombre_cliente")
	private String nombreCliente;
	
	@NotNull
	@Column
	private String rfc;
	
	@NotNull
	@Column
	private String correo;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cliente_telefono",
            joinColumns = @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente"),
            inverseJoinColumns = @JoinColumn(name = "id_telefono", referencedColumnName = "id_telefono"))
	private List<Telefono> Telefonos;
	
	public Cliente(){
		
	}

	public Cliente updateCliente(Cliente cliente) {
		this.nombreCliente = cliente.nombreCliente;
		this.rfc = cliente.rfc;
		this.correo = cliente.correo;
		this.Telefonos = cliente.getTelefonos();
		return this;
	}
	
}
