package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IEmpleadoDao;
import com.lavanderia.app.models.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoDao empleadoDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Empleado> listar() {
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Empleado obtenerPorId(Integer id) {
		return empleadoDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Empleado guardar(Empleado empleado) {
		return empleadoDao.save(empleado);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		empleadoDao.deleteById(id);
	}
}
