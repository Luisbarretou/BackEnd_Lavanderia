package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lavanderia.app.models.entity.Servicio;

public interface IServicioDao extends CrudRepository<Servicio, Integer> {

}