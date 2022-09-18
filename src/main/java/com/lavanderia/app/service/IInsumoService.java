package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.Insumo;

public interface IInsumoService {
	
	public List<Insumo> listar();
	
	public Insumo guardar(Insumo insumo);
	
	public Insumo obtenerPorId(Integer id);
	
	void eliminar (Integer id);
}