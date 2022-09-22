package com.ramaka.rgm.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "pedidos")
public class PedidosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer folio_pedidos;

	@Column(nullable = false)
	private String status;

	@Column(nullable = false)
	private String no_rastreo;

	@Column(nullable = false)
	private Date fecha;

	@Column(nullable = false)
	private String tipo_envio;
	
	@Column(nullable = false)
	private String notas;
	
	//Llave foranea
	@OneToOne
	@JoinColumn(nullable = false, name = "pedidos")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private ClienteModel id_cliente;
	
	@ManyToMany
	@JoinTable(
			name="productos_has_pedido",
			joinColumns= @JoinColumn(name="subject_id"),
			inverseJoinColumns = @JoinColumn(name="student_id"))
	private Set<ProductoModel> productos_has_pedidos = new HashSet<>();

	public Integer getFolio_pedidos() {
		return folio_pedidos;
	}

	public void setFolio_pedidos(Integer folio_pedidos) {
		this.folio_pedidos = folio_pedidos;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNo_rastreo() {
		return no_rastreo;
	}

	public void setNo_rastreo(String no_rastreo) {
		this.no_rastreo = no_rastreo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipo_envio() {
		return tipo_envio;
	}

	public void setTipo_envio(String tipo_envio) {
		this.tipo_envio = tipo_envio;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public ClienteModel getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(ClienteModel id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Set<ProductoModel> getProductos_has_pedidos() {
		return productos_has_pedidos;
	}

	public void setProductos_has_pedidos(Set<ProductoModel> productos_has_pedidos) {
		this.productos_has_pedidos = productos_has_pedidos;
	}

	

	
}

