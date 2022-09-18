package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.OrdenIngreso;

public interface IOrdenIngresoService {
	
	public List<OrdenIngreso> listar();
	
	public OrdenIngreso obtenerPorId(Integer id);
	
	public OrdenIngreso guardar(OrdenIngreso ordenIngreso);
	
	void eliminar(Integer id);

}