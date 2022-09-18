package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.lavanderia.app.models.entity.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado, Integer>{

}