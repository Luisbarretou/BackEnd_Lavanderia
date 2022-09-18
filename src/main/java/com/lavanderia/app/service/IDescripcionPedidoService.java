package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.DescripcionPedido;

public interface IDescripcionPedidoService {

	public List<DescripcionPedido> listar();
	
	public DescripcionPedido obtenerPorId(Integer id);
	
	public DescripcionPedido guardar(DescripcionPedido descripcionPedido);
	
	void eliminar(Integer id);
}
