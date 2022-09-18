package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IDetalleProvInsuDao;
import com.lavanderia.app.models.entity.DetalleProvInsu;

@Service
public class DetalleProvInsuServiceImpl implements IDetalleProvInsuService {

	@Autowired
	private IDetalleProvInsuDao detalleProvInsuDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<DetalleProvInsu> listar() {
		return (List<DetalleProvInsu>) detalleProvInsuDao.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public DetalleProvInsu obtenerPorId(Integer id) {
		return detalleProvInsuDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public DetalleProvInsu guardar(DetalleProvInsu detalleProvInsu) {
		return detalleProvInsuDao.save(detalleProvInsu);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		detalleProvInsuDao.deleteById(id);
	}
}
