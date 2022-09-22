package com.ramaka.rgm.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "cotizacion")

public class CotizacionModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (nullable = false)
	private Long id_cotizacion;
	
	@Column (nullable = false)
	private Date fecha;
	
	@Column (nullable = false)
	private String descripcion;
	
	//Llave foranea
			@OneToOne
			@JoinColumn(nullable = false, name = "pedidos")
			@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
			private ClienteModel id_cliente;

			public Long getId_cotizacion() {
				return id_cotizacion;
			}

			public void setId_cotizacion(Long id_cotizacion) {
				this.id_cotizacion = id_cotizacion;
			}

			public Date getFecha() {
				return fecha;
			}

			public void setFecha(Date fecha) {
				this.fecha = fecha;
			}

			public String getDescripcion() {
				return descripcion;
			}

			public void setDescripcion(String descripcion) {
				this.descripcion = descripcion;
			}

			public ClienteModel getId_cliente() {
				return id_cliente;
			}

			public void setId_cliente(ClienteModel id_cliente) {
				this.id_cliente = id_cliente;
			}
}

