package com.lavanderia.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cli_id")
	private Integer idCliente;
	
	@Column(length = 20, name = "cli_numDoc")
	private String nroDocumentoCliente;
	
	@Column(length = 100, name = "cli_nombre")
	private String nombreCliente;
	
	@Column(length = 45, name = "cli_razsoc")
	private String razonSocialCliente;
	
	@Column(length = 45, name = "cli_dir")
	private String direccionCliente;
	
	@Column(length = 45, name = "cli_telf")
	private String telefonoCliente;
	
	@Column(length = 45, name = "cli_correo")
	private String correoCliente;
	
	@Column(length = 45, name = "cli_estado")
	private String estadoCliente;

	public Cliente() {
		super();
	}

	public Cliente(Integer idCliente, String nroDocumentoCliente, String nombreCliente, String razonSocialCliente,
			String direccionCliente, String telefonoCliente, String correoCliente, String estadoCliente) {
		super();
		this.idCliente = idCliente;
		this.nroDocumentoCliente = nroDocumentoCliente;
		this.nombreCliente = nombreCliente;
		this.razonSocialCliente = razonSocialCliente;
		this.direccionCliente = direccionCliente;
		this.telefonoCliente = telefonoCliente;
		this.correoCliente = correoCliente;
		this.estadoCliente = estadoCliente;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNroDocumentoCliente() {
		return nroDocumentoCliente;
	}

	public void setNroDocumentoCliente(String nroDocumentoCliente) {
		this.nroDocumentoCliente = nroDocumentoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getRazonSocialCliente() {
		return razonSocialCliente;
	}

	public void setRazonSocialCliente(String razonSocialCliente) {
		this.razonSocialCliente = razonSocialCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}
	
}
