package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	
	//Listar todos
	public List<Empleado> listarEmpleados();
	
	//Listar por id
	public Empleado listarEmpleadoByID(Integer id);
	
	//Guardar
	public Empleado guardarEmpleado(Empleado e);
	
	//Actualizar
	public Empleado actualizarEmpleado(Empleado e);
	
	//Borrar
	public void eliminarEmpleado(Integer id);
	
	//Asignar Sueldo
	public double asignarSueldo(Empleado e);

}
