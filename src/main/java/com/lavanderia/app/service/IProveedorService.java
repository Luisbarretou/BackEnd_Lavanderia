package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.Proveedor;

public interface IProveedorService {
	
	public List<Proveedor> listar();
	
	public Proveedor obtenerPorId(Integer id);
	
	public Proveedor guardar(Proveedor proveedor);
	
	void eliminar(Integer id);
}