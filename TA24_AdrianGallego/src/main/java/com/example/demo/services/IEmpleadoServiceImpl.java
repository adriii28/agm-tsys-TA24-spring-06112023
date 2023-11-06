package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class IEmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	IEmpleadoDAO iEmpDao;
	
	@Override
	public List<Empleado> listarEmpleados() {
		return iEmpDao.findAll();
	}

	@Override
	public Empleado listarEmpleadoByID(Integer id) {
		return iEmpDao.findById(id).get();
	}

	@Override
	public Empleado guardarEmpleado(Empleado e) {
		double sueldo = asignarSueldo(e);
		e.setSalario(sueldo);
		return iEmpDao.save(e);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado e) {
		return iEmpDao.save(e);
	}

	@Override
	public void eliminarEmpleado(Integer id) {
		iEmpDao.deleteById(id);
		
	}

	@Override
	public double asignarSueldo(Empleado e) {
		double sueldo = 0;
		switch (e.getTrabajo()) {
		case Programador:
			sueldo = 2000;
			break;
		case Diseñador:
			sueldo = 1500;
			break;
		case Administracion:
			sueldo = 1700;
			break;
		}
		return sueldo;
	}

}
