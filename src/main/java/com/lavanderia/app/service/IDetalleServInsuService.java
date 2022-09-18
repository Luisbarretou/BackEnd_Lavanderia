package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.DetalleServInsu;

public interface IDetalleServInsuService {

	public List<DetalleServInsu> listar();
	
	public DetalleServInsu obtenerPorId(Integer id);
	
	public DetalleServInsu guardar(DetalleServInsu detalleServInsu);
	
	void eliminar(Integer id);
}
