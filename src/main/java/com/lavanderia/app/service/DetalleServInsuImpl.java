package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IDetalleServInsuDao;
import com.lavanderia.app.models.entity.DetalleServInsu;

@Service
public class DetalleServInsuImpl implements IDetalleServInsuService {

	@Autowired
	private IDetalleServInsuDao detalleServInsuDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<DetalleServInsu> listar() {
		return (List<DetalleServInsu>) detalleServInsuDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public DetalleServInsu obtenerPorId(Integer id) {
		return detalleServInsuDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public DetalleServInsu guardar(DetalleServInsu detalleServInsu) {
		return detalleServInsuDao.save(detalleServInsu);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		detalleServInsuDao.deleteById(id);
	}

}
