package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.Servicio;

public interface IServicioService {
	
	public List<Servicio> listar();
	
	public Servicio obtenerPorId(Integer id);
	
	public Servicio guardar(Servicio servicio);
	
	void eliminar(Integer id);
}