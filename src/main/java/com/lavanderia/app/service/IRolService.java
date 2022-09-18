package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.Rol;

public interface IRolService {
	
	public List<Rol> listar();
	
	public Rol obtenerPorId(Integer id);
	
	public Rol guardar(Rol rol);
	
	void eliminar(Integer id);
}