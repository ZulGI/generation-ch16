package com.ramaka.rgm.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;





@Entity
@Table(name = "cliente")

public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id_cliente;
	
	
	@Column
	private String s_apellido;
	@Column
	private Double telefono;
	@Column
	private String referencias;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String p_apellido;
	
	@Column(nullable = false)
	private String correo;
	
	@Column(nullable = false)
	private String calle;
	
	@Column(nullable = false)
	private String ciudad;
	
	@Column(nullable = false)
	private String estado;
	
	@Column(nullable = false)
	private Integer cp;

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getS_apellido() {
		return s_apellido;
	}

	public void setS_apellido(String s_apellido) {
		this.s_apellido = s_apellido;
	}

	public Double getTelefono() {
		return telefono;
	}

	public void setTelefono(Double telefono) {
		this.telefono = telefono;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getP_apellido() {
		return p_apellido;
	}

	public void setP_apellido(String p_apellido) {
		this.p_apellido = p_apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}


}
