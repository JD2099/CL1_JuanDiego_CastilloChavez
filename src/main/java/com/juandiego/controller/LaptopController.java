package com.juandiego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.juandiego.model.Laptop;
import com.juandiego.repository.ILaptopRepository;

public class LaptopController {

	@Autowired
	private ILaptopRepository repo;
	
	@GetMapping("/listar")
	public String listadoProducto(Model model) {
		model.addAttribute("lstProductos", repo.findAll());
		return "listado";
	}
	
	
	//-------------------------------------------
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		Laptop lap = new Laptop();
		model.addAttribute("producto", lap);
		return "crudproductos";
	}
	
	@PostMapping("/grabar")
	public String grabarPag(@ModelAttribute Laptop laptop) {
		repo.save(laptop);
		return "exito";
	}
}

