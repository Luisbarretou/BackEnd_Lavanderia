package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lavanderia.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Integer> {

}
