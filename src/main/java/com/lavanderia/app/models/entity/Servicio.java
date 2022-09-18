package com.lavanderia.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serv_id")
	private Integer servicioID;
	
	@Column(length = 45, name = "serv_nombre")
	private String nombre;
	
	@Column(length = 255, name = "serv_descripcion")
	private String descripcion;
	
	@Column(name = "serv_precio", columnDefinition= "decimal(8,2)")
	private Double precio;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Empleado empleado;
	
	@ManyToMany(mappedBy = "servicios", cascade = CascadeType.ALL)
	private List<Pedido> pedidos = new ArrayList<>();
	
	public Servicio() {
		super();
	}
	
	public Servicio(Integer servicioID, String nombre, String descripcion, Double precio, Empleado empleado
			, List<Pedido> pedidos) {
		super();
		this.servicioID = servicioID;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.empleado = empleado;
		this.pedidos = pedidos;
	}

	public Integer getServicioID() {
		return servicioID;
	}

	public void setServicioID(Integer servicioID) {
		this.servicioID = servicioID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}
