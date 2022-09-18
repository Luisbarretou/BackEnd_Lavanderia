package com.lavanderia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lavanderia.app.models.dao.IUsuarioDao;
import com.lavanderia.app.models.entity.Usuario;


@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioDao usuarioDao;

	@Transactional(readOnly = true)
	@Override
	public List<Usuario> listar() {
		return(List<Usuario>) usuarioDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Usuario obtenerPorId(Integer id) {
		return usuarioDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Usuario guardar(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		usuarioDao.deleteById(id);

	}

}