package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lavanderia.app.models.entity.Proveedor;

public interface IProveedorDao extends CrudRepository<Proveedor, Integer>{

}