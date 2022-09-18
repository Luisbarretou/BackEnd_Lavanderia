package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.Almacen;

public interface IAlmacenService {
	
	public List<Almacen> listar();
	
	public Almacen guardar(Almacen almacen);
	
	public Almacen obtnerPorId(Integer id);
	
	void eliminar(Integer id);
}
