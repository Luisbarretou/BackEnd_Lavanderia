package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lavanderia.app.models.entity.Rol;

public interface IRolDao extends CrudRepository<Rol, Integer> {

}