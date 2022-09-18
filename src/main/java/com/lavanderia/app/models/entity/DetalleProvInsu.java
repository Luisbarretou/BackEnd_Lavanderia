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
@Table(name = "detalle_prov_ins")
public class DetalleProvInsu implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "det_prov_ins_id")
	private Integer idDetalleProvIns;
	
	@Column(name = "det_prov_ins_cant")
	private Integer cantidadDetalleProvIns;

	@ManyToOne
	@JoinColumn(name = "ins_id")
	private Insumo insumo;
	
	@ManyToOne
	@JoinColumn(name = "prov_id")
	private Proveedor proveedor;

	public DetalleProvInsu() {
		super();
	}

	public DetalleProvInsu(Integer idDetalleProvIns, Integer cantidadDetalleProvIns, Insumo insumo,
			Proveedor proveedor) {
		super();
		this.idDetalleProvIns = idDetalleProvIns;
		this.cantidadDetalleProvIns = cantidadDetalleProvIns;
		this.insumo = insumo;
		this.proveedor = proveedor;
	}

	public Integer getIdDetalleProvIns() {
		return idDetalleProvIns;
	}

	public void setIdDetalleProvIns(Integer idDetalleProvIns) {
		this.idDetalleProvIns = idDetalleProvIns;
	}

	public Integer getCantidadDetalleProvIns() {
		return cantidadDetalleProvIns;
	}

	public void setCantidadDetalleProvIns(Integer cantidadDetalleProvIns) {
		this.cantidadDetalleProvIns = cantidadDetalleProvIns;
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
}
