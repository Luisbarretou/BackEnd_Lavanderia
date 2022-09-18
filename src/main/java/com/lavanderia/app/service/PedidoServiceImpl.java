package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IPedidoDao;
import com.lavanderia.app.models.entity.Pedido;

@Service
public class PedidoServiceImpl implements IPedidoService {
	
	@Autowired
	private IPedidoDao pedidoDao;

	@Transactional(readOnly = true)
	@Override
	public List<Pedido> listar() {
		return (List<Pedido>) pedidoDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Pedido obtenerPorId(Integer id) {
		return pedidoDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Pedido guardar(Pedido pedido) {
		return pedidoDao.save(pedido);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		pedidoDao.deleteById(id);

	}

}
