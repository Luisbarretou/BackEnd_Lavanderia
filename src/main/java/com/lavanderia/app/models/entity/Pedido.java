package com.lavanderia.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ped_id")
	private Integer idPedido;
	
	@Column(columnDefinition = "datetime", name= "ped_fechaing")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaIngreso;
	
	@Column(columnDefinition = "datetime", name= "ped_fechaent")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaEntrega;
	
	@Column(length = 45, name = "ped_estado")
	private String estadoPedido;
	
	@ManyToOne
	@JoinColumn(name= "ord_ing_id")
	private OrdenIngreso ordenIngreso;

	@ManyToOne
	@JoinColumn(name= "cli_id")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<DescripcionPedido> descripcionPed = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "detalle_ped_serv", joinColumns = @JoinColumn(name = "ped_id"),
				inverseJoinColumns = @JoinColumn(name = "serv_id"))
	private Set<Servicio> servicios = new HashSet<>();

	//Funcion para insertar Descripciones a los pedidos
	public void insertarDescripcion(String descripcion, Integer cantidad) {
		this.descripcionPed.add(new DescripcionPedido(descripcion,cantidad,this));
	}
	//
	
	public Pedido() {
		super();
	}
	
	public Pedido(Integer idPedido, Date fechaIngreso, Date fechaEntrega, String estadoPedido,
			OrdenIngreso ordenIngreso, Cliente cliente, List<DescripcionPedido> descripcionPed,
			Set<Servicio> servicios) {
		super();
		this.idPedido = idPedido;
		this.fechaIngreso = fechaIngreso;
		this.fechaEntrega = fechaEntrega;
		this.estadoPedido = estadoPedido;
		this.ordenIngreso = ordenIngreso;
		this.cliente = cliente;
		this.descripcionPed = descripcionPed;
		this.servicios = servicios;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public OrdenIngreso getOrdenIngreso() {
		return ordenIngreso;
	}

	public void setOrdenIngreso(OrdenIngreso ordenIngreso) {
		this.ordenIngreso = ordenIngreso;
	}

	public Set<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}

	public List<DescripcionPedido> getDescripcionPed() {
		return descripcionPed;
	}

	public void setDescripcionPed(List<DescripcionPedido> descripcionPed) {
		this.descripcionPed = descripcionPed;
	}
	
}