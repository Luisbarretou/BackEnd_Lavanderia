package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lavanderia.app.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Integer>{

}