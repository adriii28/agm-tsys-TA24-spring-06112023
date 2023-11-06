package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.IEmpleadoService;
import com.example.demo.dto.Empleado;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
	
	@Autowired
	IEmpleadoService iEmpSer;
	
	@GetMapping("/all")
	public List<Empleado> listarClientes(){
		return iEmpSer.listarEmpleados();
	}
	
	@GetMapping("/{id}")
	public Empleado listarEmpleadoById(@PathVariable(name="id") Integer id) {
		return iEmpSer.listarEmpleadoByID(id);
		
	}
	
	@PostMapping("/add")
	public Empleado newEmpleado(@RequestBody Empleado e) {
		return iEmpSer.guardarEmpleado(e);
	}
	
	@PutMapping("/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id") Integer id, @RequestBody Empleado e) {
		
		Empleado e1 = iEmpSer.listarEmpleadoByID(id);
		Empleado e2 = new Empleado();
		
		e1.setNombre(e.getNombre());
		e1.setApellido(e.getApellido());
		e1.setTrabajo(e.getTrabajo());
		
		e2 = iEmpSer.actualizarEmpleado(e1);
		return e2;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarEmpleado(@PathVariable Integer id) {
		iEmpSer.eliminarEmpleado(id);
	}
	

}
