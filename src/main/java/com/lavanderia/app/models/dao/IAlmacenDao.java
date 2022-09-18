package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.lavanderia.app.models.entity.Almacen;

public interface IAlmacenDao extends CrudRepository<Almacen, Integer>{

}