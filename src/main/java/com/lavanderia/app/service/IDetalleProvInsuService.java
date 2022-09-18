package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.DetalleProvInsu;

public interface IDetalleProvInsuService {
	
	public List<DetalleProvInsu>  listar();
	
	public DetalleProvInsu obtenerPorId(Integer id);
	
	public DetalleProvInsu guardar(DetalleProvInsu detalleProvInsu);
	
	void eliminar(Integer id);
}
