package com.lavanderia.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lavanderia.app.models.entity.Pedido;

public interface IPedidoDao extends CrudRepository<Pedido, Integer> {

}