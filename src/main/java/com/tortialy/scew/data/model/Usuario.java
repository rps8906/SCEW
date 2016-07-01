package com.tortialy.scew.data.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "usuarios")
@NoArgsConstructor
@NamedQueries({
	@NamedQuery(name="Usuario.findByUsername", query="SELECT u FROM Usuario u WHERE u.username = :username")})
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@GeneratedValue
	@Column(name="id_usuario")
	private int idUsuario;
	
	@NotNull
	@Column
	private String username;
	
	@NotNull
	@Column(name="nombre_completo")
	private String nombreCompleto;
	
	@NotNull
	@Column
	private String password;
	
	@NotNull
	@Column
	private String correo;
	
	@NotNull
	@Column
	private boolean enabled;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	private Set<Rol> roles = new HashSet<Rol>(0);;

}
