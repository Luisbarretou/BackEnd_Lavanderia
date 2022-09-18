package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IRolDao;
import com.lavanderia.app.models.entity.Rol;

@Service
public class RolServiceImpl implements IRolService {
	
	@Autowired
	private IRolDao rolDao;

	@Transactional(readOnly = true)
	@Override
	public List<Rol> listar() {
		return (List<Rol>) rolDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Rol obtenerPorId(Integer id) {
		return rolDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Rol guardar(Rol rol) {
		return rolDao.save(rol);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		rolDao.deleteById(id);

	}

}