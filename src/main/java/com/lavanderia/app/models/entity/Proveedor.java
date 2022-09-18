package com.lavanderia.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prov_id")
	private Integer provId;
	
	@Column(length = 20, name = "prov_ruc")
	private String ruc;
	
	@Column(length = 50, name = "prov_nombre")
	private String nombre;
	
	@Column(length = 45, name = "prov_dir")
	private String direccion;
	
	@Column(length = 45, name = "prov_telf")
	private String telefono;
	
	@Column(length = 45, name = "prov_estado")
	private String estado;
	
	@Column(length = 45, name = "prov_correo")
	private String correo;
	
	public Proveedor() {
		super();
	}

	public Proveedor(Integer provId, String ruc, String nombre, String direccion, String telefono, String estado,
			String correo) {
		super();
		this.provId = provId;
		this.ruc = ruc;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estado = estado;
		this.correo = correo;
	}

	public Integer getProvId() {
		return provId;
	}

	public void setProvId(Integer provId) {
		this.provId = provId;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
