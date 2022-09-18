package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.Boleta;

public interface IBoletaService {
	
	public List<Boleta> listar();
	
	public Boleta obtenerPorId(Integer id);
	
	public Boleta guardar(Boleta boleta);
	
	void eliminar(Integer id);
}
