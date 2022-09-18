package com.lavanderia.app.service;

import java.util.List;

import com.lavanderia.app.models.entity.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listar();
	
	public Empleado obtenerPorId(Integer id);
	
	public Empleado guardar(Empleado empleado);
	
	void eliminar(Integer id);
}
