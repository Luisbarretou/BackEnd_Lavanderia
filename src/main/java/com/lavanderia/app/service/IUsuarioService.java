package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> listar();
	
	public Usuario obtenerPorId(Integer id);
	
	public Usuario guardar(Usuario usuario);
	
	void eliminar(Integer id);
}