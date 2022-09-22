package com.ramaka.rgm.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "productos")
public class ProductoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_productos;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String descripcion;
	
	@Column(nullable = false)
	private String precio;
	
	@Column(nullable = false)
	private Integer cantidad;

	@JsonIgnore
	@ManyToMany(mappedBy = "productos_has_pedidos")
	Set<PedidosModel> pedidos = new HashSet<>();

	public Integer getId_productos() {
		return id_productos;
	}

	public void setId_productos(Integer id_productos) {
		this.id_productos = id_productos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Set<PedidosModel> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<PedidosModel> pedidos) {
		this.pedidos = pedidos;
	}

	
	
	
}