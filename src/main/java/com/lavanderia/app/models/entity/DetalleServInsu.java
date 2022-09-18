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
@Table(name = "detalle_ser_ins")
public class DetalleServInsu implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "det_ser_ins_id")
	private Integer idDetalleServInsu;
	
	@Column(name = "det_ser_ins_cant")
	private Integer cantidadDetalleServInsu;
	
	@ManyToOne
	@JoinColumn(name = "serv_id")
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name = "ins_id")
	private Insumo insumo;

	public DetalleServInsu() {
		super();
	}

	public DetalleServInsu(Integer idDetalleServInsu, Integer cantidadDetalleServInsu, Servicio servicio,
			Insumo insumo) {
		super();
		this.idDetalleServInsu = idDetalleServInsu;
		this.cantidadDetalleServInsu = cantidadDetalleServInsu;
		this.servicio = servicio;
		this.insumo = insumo;
	}

	public Integer getIdDetalleServInsu() {
		return idDetalleServInsu;
	}

	public void setIdDetalleServInsu(Integer idDetalleServInsu) {
		this.idDetalleServInsu = idDetalleServInsu;
	}

	public Integer getCantidadDetalleServInsu() {
		return cantidadDetalleServInsu;
	}

	public void setCantidadDetalleServInsu(Integer cantidadDetalleServInsu) {
		this.cantidadDetalleServInsu = cantidadDetalleServInsu;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}	
}