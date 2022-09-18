package com.lavanderia.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer idEmpleado;
	
	@Column(length = 45, name = "emp_nombre")
	private String nombreEmpleado;
	
	@Column(length = 45, name = "emp_apellido")
	private String apellidoEmpleado;
	
	@Column(length = 15, name = "emp_numdoc")
	private String nroDocumentoEmpleado;
	
	@Column(columnDefinition = "datetime", name= "emp_fechanaci")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimientoEmpleado;
	
	@Column(length = 45, name = "emp_correo")
	private String correoEmpleado;
	
	@Column(length = 45, name = "emp_telf")
	private String telefonoEmpleado;
	
	@Column(length = 45, name = "emp_dir")
	private String direccionEmpleado;
	
	@Column(length = 45, name = "emp_estado")
	private String estadoEmpleado;

	public Empleado() {
		super();
	}

	public Empleado(Integer idEmpleado, String nombreEmpleado, String apellidoEmpleado, String nroDocumentoEmpleado,
			Date fechaNacimientoEmpleado, String correoEmpleado, String telefonoEmpleado, String direccionEmpleado,
			String estadoEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		this.nroDocumentoEmpleado = nroDocumentoEmpleado;
		this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.telefonoEmpleado = telefonoEmpleado;
		this.direccionEmpleado = direccionEmpleado;
		this.estadoEmpleado = estadoEmpleado;
	}

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public String getNroDocumentoEmpleado() {
		return nroDocumentoEmpleado;
	}

	public void setNroDocumentoEmpleado(String nroDocumentoEmpleado) {
		this.nroDocumentoEmpleado = nroDocumentoEmpleado;
	}

	public Date getFechaNacimientoEmpleado() {
		return fechaNacimientoEmpleado;
	}

	public void setFechaNacimientoEmpleado(Date fechaNacimientoEmpleado) {
		this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
	}

	public String getCorreoEmpleado() {
		return correoEmpleado;
	}

	public void setCorreoEmpleado(String correoEmpleado) {
		this.correoEmpleado = correoEmpleado;
	}

	public String getTelefonoEmpleado() {
		return telefonoEmpleado;
	}

	public void setTelefonoEmpleado(String telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}

	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}

	public String getEstadoEmpleado() {
		return estadoEmpleado;
	}

	public void setEstadoEmpleado(String estadoEmpleado) {
		this.estadoEmpleado = estadoEmpleado;
	}
	
}
