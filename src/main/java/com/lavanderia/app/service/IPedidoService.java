package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.Pedido;

public interface IPedidoService {
	
	public List<Pedido> listar();
	
	public Pedido obtenerPorId(Integer id);
	
	public Pedido guardar(Pedido pedido);
	
	void eliminar(Integer id);
}