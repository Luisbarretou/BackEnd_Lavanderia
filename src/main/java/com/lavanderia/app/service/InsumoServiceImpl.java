package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IInsumoDao;
import com.lavanderia.app.models.entity.Insumo;

@Service
public class InsumoServiceImpl implements IInsumoService {
	
	@Autowired
	private IInsumoDao insumoDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Insumo> listar() {
		return (List<Insumo>) insumoDao.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Insumo obtenerPorId(Integer id) {
		return insumoDao.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public Insumo guardar(Insumo insumo) {
		return insumoDao.save(insumo);
	}
	
	@Transactional
	@Override
	public void eliminar(Integer id) {
		insumoDao.deleteById(id);
	}

}
