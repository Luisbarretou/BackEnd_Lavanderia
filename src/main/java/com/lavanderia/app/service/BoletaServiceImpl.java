package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IBoletaDao;
import com.lavanderia.app.models.entity.Boleta;


@Service
public class BoletaServiceImpl implements IBoletaService {

	@Autowired
	private IBoletaDao boletaDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Boleta> listar() {
		return (List<Boleta>) boletaDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Boleta obtenerPorId(Integer id) {
		return boletaDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Boleta guardar(Boleta boleta) {
		return boletaDao.save(null);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		boletaDao.deleteById(id);
	}

}
