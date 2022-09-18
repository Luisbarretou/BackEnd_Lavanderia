package com.lavanderia.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insumo")
public class Insumo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ins_id")
	private Integer insumoId;
	
	@Column(length = 50, name = "ins_nombre")
	private String nombre;
	
	@Column(name = "ins_stock")
	private Integer stock;
	
	@Column(length = 45, name = "ins_marca")
	private String marca;
	
	@Column(length = 45, name = "ins_estado")
	private String estado;	
	
	public Insumo() {
		super();
	}


	public Insumo(Integer insumoId, String nombre, Integer stock, String marca, String estado) {
		super();
		this.insumoId = insumoId;
		this.nombre = nombre;
		this.stock = stock;
		this.marca = marca;
		this.estado = estado;
	}


	public Integer getInsumoId() {
		return insumoId;
	}


	public void setInsumoId(Integer insumoId) {
		this.insumoId = insumoId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}

}
