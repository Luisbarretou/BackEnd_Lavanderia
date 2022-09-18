package com.lavanderia.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "descripcion_pedido")
public class DescripcionPedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "des_ped_id")
	private Integer idDescripP;
	
	@Column(length = 255,name = "des_ped_desc")
	private String descripcionP;
	
	@Column(name = "des_ped_cant")
	private Integer cantidadDescripP;
	
	@ManyToOne
	@JoinColumn(name = "pedi_id")
	private Pedido pedido;

	public DescripcionPedido() {
		super();
	}

	public DescripcionPedido(Integer idDescripP, String descripcionP, Integer cantidadDescripP, Pedido pedido) {
		super();
		this.idDescripP = idDescripP;
		this.descripcionP = descripcionP;
		this.cantidadDescripP = cantidadDescripP;
		this.pedido = pedido;
	}

	public DescripcionPedido(String descripcionP, Integer cantidadDescripP, Pedido pedido) {
		super();
		this.descripcionP = descripcionP;
		this.cantidadDescripP = cantidadDescripP;
		this.pedido = pedido;
	}

	public Integer getIdDescripP() {
		return idDescripP;
	}

	public void setIdDescripP(Integer idDescripP) {
		this.idDescripP = idDescripP;
	}

	public String getDescripcionP() {
		return descripcionP;
	}

	public void setDescripcionP(String descripcionP) {
		this.descripcionP = descripcionP;
	}

	public Integer getCantidadDescripP() {
		return cantidadDescripP;
	}

	public void setCantidadDescripP(Integer cantidadDescripP) {
		this.cantidadDescripP = cantidadDescripP;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "Descripcion: " + descripcionP + ", cantidad: " + cantidadDescripP;
	}
	
}
