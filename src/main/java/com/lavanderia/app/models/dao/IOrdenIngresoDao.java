package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lavanderia.app.models.entity.OrdenIngreso;

public interface IOrdenIngresoDao extends CrudRepository<OrdenIngreso, Integer> {

}