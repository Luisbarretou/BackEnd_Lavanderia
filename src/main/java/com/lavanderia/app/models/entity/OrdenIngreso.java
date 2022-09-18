package com.lavanderia.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "orden_ingreso")
public class OrdenIngreso implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ord_ing_id")
	private Integer idOrdenIngreso;
	
	@Column(columnDefinition = "datetime", name= "ord_ing_fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaOrdenIngreso;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name = "alma_id")
	private Almacen almacen;
	
	@OneToMany
	@JoinColumn(name = "ord_ing_id")
	private List<Pedido> pedidos = new ArrayList<>();
	
	public OrdenIngreso() {
		super();
	}
	
	public OrdenIngreso(Integer idOrdenIngreso, Date fechaOrdenIngreso, Empleado empleado, Almacen almacen,
			List<Pedido> pedidos) {
		super();
		this.idOrdenIngreso = idOrdenIngreso;
		this.fechaOrdenIngreso = fechaOrdenIngreso;
		this.empleado = empleado;
		this.almacen = almacen;
		this.pedidos = pedidos;
	}

	public Integer getIdOrdenIngreso() {
		return idOrdenIngreso;
	}

	public void setIdOrdenIngreso(Integer idOrdenIngreso) {
		this.idOrdenIngreso = idOrdenIngreso;
	}

	public Date getFechaOrdenIngreso() {
		return fechaOrdenIngreso;
	}

	public void setFechaOrdenIngreso(Date fechaOrdenIngreso) {
		this.fechaOrdenIngreso = fechaOrdenIngreso;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "ID:" + idOrdenIngreso + ", fecha Ingreso:" + fechaOrdenIngreso ;
	}
	
}
