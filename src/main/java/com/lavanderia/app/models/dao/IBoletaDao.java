package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.lavanderia.app.models.entity.Boleta;

public interface IBoletaDao extends CrudRepository<Boleta, Integer>{

}