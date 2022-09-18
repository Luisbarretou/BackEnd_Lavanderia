package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IProveedorDao;
import com.lavanderia.app.models.entity.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {
	
	@Autowired
	private IProveedorDao proveedorDao;

	@Transactional(readOnly = true)
	@Override
	public List<Proveedor> listar() {
		return (List<Proveedor>) proveedorDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Proveedor obtenerPorId(Integer id) {
		return proveedorDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Proveedor guardar(Proveedor proveedor) {
		return proveedorDao.save(proveedor);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		proveedorDao.deleteById(id);

	}

}
