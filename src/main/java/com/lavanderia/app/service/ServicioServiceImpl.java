package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IServicioDao;
import com.lavanderia.app.models.entity.Servicio;

@Service
public class ServicioServiceImpl implements IServicioService {
	
	@Autowired
	private IServicioDao servicioDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Servicio> listar() {
		return (List<Servicio>) servicioDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Servicio obtenerPorId(Integer id) {
		return servicioDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Servicio guardar(Servicio servicio) {
		return servicioDao.save(servicio);
	}

	@Transactional 
	@Override
	public void eliminar(Integer id) {
		servicioDao.deleteById(id);

	}

}