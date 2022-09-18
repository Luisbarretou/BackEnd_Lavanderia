package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lavanderia.app.models.entity.Insumo;

public interface IInsumoDao extends CrudRepository<Insumo, Integer> {

}