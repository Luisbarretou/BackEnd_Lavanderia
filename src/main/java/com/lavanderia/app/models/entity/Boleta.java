package com.lavanderia.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "boleta")
public class Boleta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bol_id")
	private Integer idBoleta;
	
	@Column(columnDefinition = "datetime", name= "bol_fechaemi")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaEmisionBoleta; 
	
	@Column(columnDefinition = "decimal(8,2)", name = "bol_total")
	private Integer totalBoleta;
	
	@Column(length = 20, name = "bol_estado")
	private String estadoBoleta;
	
	@Column(length = 20, name = "bol_metodopago")
	private String metodoPagoBoleta;
	
	@Column(columnDefinition = "datetime", name= "bol_fechapago")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaPagoBoleta;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ped_id")
	private Pedido pedido;

	public Boleta() {
		super();
	}

	public Boleta(Integer idBoleta, Date fechaEmisionBoleta, Integer totalBoleta, String estadoBoleta,
			String metodoPagoBoleta, Date fechaPagoBoleta, Pedido pedido) {
		super();
		this.idBoleta = idBoleta;
		this.fechaEmisionBoleta = fechaEmisionBoleta;
		this.totalBoleta = totalBoleta;
		this.estadoBoleta = estadoBoleta;
		this.metodoPagoBoleta = metodoPagoBoleta;
		this.fechaPagoBoleta = fechaPagoBoleta;
		this.pedido = pedido;
	}

	public Integer getIdBoleta() {
		return idBoleta;
	}

	public void setIdBoleta(Integer idBoleta) {
		this.idBoleta = idBoleta;
	}

	public Date getFechaEmisionBoleta() {
		return fechaEmisionBoleta;
	}

	public void setFechaEmisionBoleta(Date fechaEmisionBoleta) {
		this.fechaEmisionBoleta = fechaEmisionBoleta;
	}

	public Integer getTotalBoleta() {
		return totalBoleta;
	}

	public void setTotalBoleta(Integer totalBoleta) {
		this.totalBoleta = totalBoleta;
	}

	public String getEstadoBoleta() {
		return estadoBoleta;
	}

	public void setEstadoBoleta(String estadoBoleta) {
		this.estadoBoleta = estadoBoleta;
	}

	public String getMetodoPagoBoleta() {
		return metodoPagoBoleta;
	}

	public void setMetodoPagoBoleta(String metodoPagoBoleta) {
		this.metodoPagoBoleta = metodoPagoBoleta;
	}

	public Date getFechaPagoBoleta() {
		return fechaPagoBoleta;
	}

	public void setFechaPagoBoleta(Date fechaPagoBoleta) {
		this.fechaPagoBoleta = fechaPagoBoleta;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}	
}
