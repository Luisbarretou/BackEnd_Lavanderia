package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IOrdenIngresoDao;
import com.lavanderia.app.models.entity.OrdenIngreso;

@Service
public class OrdenIngresoServiceImpl implements IOrdenIngresoService {
	
	@Autowired
	private IOrdenIngresoDao ordenIngresoDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<OrdenIngreso> listar() {
		return (List<OrdenIngreso>) ordenIngresoDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public OrdenIngreso obtenerPorId(Integer id) {
		return ordenIngresoDao.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public OrdenIngreso guardar(OrdenIngreso ordenIngreso) {
		return ordenIngresoDao.save(ordenIngreso);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		ordenIngresoDao.deleteById(id);

	}

}