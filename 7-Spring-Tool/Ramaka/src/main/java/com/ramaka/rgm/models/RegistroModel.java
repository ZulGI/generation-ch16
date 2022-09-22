package com.ramaka.rgm.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//javax.persistence.id/);

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "registro")

public class RegistroModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id_registro;

	@Column(nullable = false)
	private String contraseña;

	@Column(nullable = false)
	private String usuario;

	//Llave foranea
	@OneToOne
	@JoinColumn(nullable = false, name = "pedidos")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private ClienteModel id_cliente;

	public Long getId_registro() {
		return id_registro;
	}

	public void setId_registro(Long id_registro) {
		this.id_registro = id_registro;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public ClienteModel getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(ClienteModel id_cliente) {
		this.id_cliente = id_cliente;
	}

}