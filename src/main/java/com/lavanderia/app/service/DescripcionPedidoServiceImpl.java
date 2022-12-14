package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IDescripcionPedidoDao;
import com.lavanderia.app.models.entity.DescripcionPedido;

@Service
public class DescripcionPedidoServiceImpl implements IDescripcionPedidoService {

	@Autowired
	private IDescripcionPedidoDao descripcionPedidoDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<DescripcionPedido> listar() {
		return (List<DescripcionPedido>) descripcionPedidoDao.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public DescripcionPedido obtenerPorId(Integer id) {
		return descripcionPedidoDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public DescripcionPedido guardar(DescripcionPedido descripcionPedido) {
		return descripcionPedidoDao.save(descripcionPedido);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		descripcionPedidoDao.deleteById(id);
	}

}
