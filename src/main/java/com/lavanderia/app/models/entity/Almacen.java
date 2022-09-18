package com.lavanderia.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "almacen")
public class Almacen implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alma_id")
	private Integer idAlmacen;
	
	@Column(length = 45, name = "almacen_nombre")
	private String nombreAlmacen;
	
	public Almacen() {
		super();
	}

	public Almacen(Integer idAlmacen, String nombreAlmacen) {
		super();
		this.idAlmacen = idAlmacen;
		this.nombreAlmacen = nombreAlmacen;
	}

	public Integer getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(Integer idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public String getNombreAlmacen() {
		return nombreAlmacen;
	}

	public void setNombreAlmacen(String nombreAlmacen) {
		this.nombreAlmacen = nombreAlmacen;
	}

}
