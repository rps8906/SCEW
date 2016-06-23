package com.tortialy.scew.data.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "orden_dia")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrdenDia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	@Column(name = "id_orden")
	private int idOrden;
	@NotNull
	@Column(name = "id_cliente")
	private int idCliente;
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable=false)
    @ManyToOne(optional = false)
	private Cliente cliente;
	@NotNull
	@Column(name = "mensaje")
	private String mensaje;
	@NotNull
	@Column
	private Date fecha;

}
