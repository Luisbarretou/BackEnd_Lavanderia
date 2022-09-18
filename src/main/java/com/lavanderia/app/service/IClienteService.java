package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> listar();
	
	public Cliente guardar(Cliente cliente);
	
	public Cliente obtenerPorId(Integer id);
	
	void eliminar(Integer id);
}
