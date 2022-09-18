package com.lavanderia.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_id")
	private Integer idUsuario;
	
	@Column(length = 45,name = "usu_user")
	private String userUsuario;
	
	@Column(length = 45,name = "usu_pass")
	private String passwordUsuario;
	
	@Column(length = 45,name = "usu_estado")
	private String estadoUsuario;
	
	@ManyToOne
	@JoinColumn(name = "rol_id")
	private Rol rol;
	
	@OneToOne
	@JoinColumn(name = "emp_id")
	private Empleado empleado;
	
	

	public Usuario() {
		super();
	}

	public Usuario(Integer idUsuario, String userUsuario, String passwordUsuario, String estadoUsuario, Rol rol,
			Empleado empleado) {
		super();
		this.idUsuario = idUsuario;
		this.userUsuario = userUsuario;
		this.passwordUsuario = passwordUsuario;
		this.estadoUsuario = estadoUsuario;
		this.rol = rol;
		this.empleado = empleado;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUserUsuario() {
		return userUsuario;
	}

	public void setUserUsuario(String userUsuario) {
		this.userUsuario = userUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}

	public String getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(String estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
}
