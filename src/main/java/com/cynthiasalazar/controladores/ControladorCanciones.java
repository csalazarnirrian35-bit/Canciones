package com.cynthiasalazar.controladores;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cynthiasalazar.modelos.Cancion;
import com.cynthiasalazar.servicios.ServicioCanciones;


import jakarta.validation.Valid;

@Controller
public class ControladorCanciones {
	
	@Autowired
	private ServicioCanciones servicioCanciones;
		
	@GetMapping("/canciones")
	public String desplegarCanciones(Model modelo) {
		modelo.addAttribute("listaCanciones", servicioCanciones.obtenerTodasLasCanciones());
		return "canciones.jsp";
	}

	@GetMapping("/canciones/detalle/{idCancion}")
	public String desplegarDetalleCancion(@PathVariable("idCancion") Long idCancion, Model modelo) {
		Cancion cancion = servicioCanciones.obtenerCancionPorId(idCancion);
		modelo.addAttribute("cancion", cancion);
		return "detalleCancion.jsp";
	}
	
	@GetMapping("/canciones/formulario/agregar")
	public String formularioAgregarCancion(Model modelo) {
		modelo.addAttribute("addCancion", new Cancion());
		return "agregarCancion.jsp";
		
	}
		
	
	
	@PostMapping("/canciones/procesa/agregar")
	public String procesarAgregarCancion(@Valid @ModelAttribute("addCancion") Cancion cancion, BindingResult validaciones) {
		if(validaciones.hasErrors()) {
			return "agregarCancion.jsp";
		}
		this.servicioCanciones.agregarCancion(cancion);
		return "redirect:/canciones";
		
	}
	
}
