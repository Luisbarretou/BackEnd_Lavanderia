package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IAlmacenDao;
import com.lavanderia.app.models.entity.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService {

	@Autowired
	private IAlmacenDao almacenDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Almacen> listar() {
		return (List<Almacen>) almacenDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Almacen obtnerPorId(Integer id) {
		return almacenDao.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public Almacen guardar(Almacen almacen) {
		return almacenDao.save(almacen);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		almacenDao.deleteById(id);
	}

}
