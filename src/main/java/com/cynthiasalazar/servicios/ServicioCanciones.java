package com.cynthiasalazar.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cynthiasalazar.modelos.Cancion;
import com.cynthiasalazar.repositorios.RepositorioCanciones;

@Service
public class ServicioCanciones {
	
	@Autowired
	private RepositorioCanciones repositorioCanciones;
	
	public List<Cancion> obtenerTodasLasCanciones(){
		return this.repositorioCanciones.findAll();
		
	}

	public Cancion obtenerCancionPorId(Long id) {
		return repositorioCanciones.findById(id).orElse(null);
	}
	
	public Cancion agregarCancion(Cancion cancion) {
		return this.repositorioCanciones.save(cancion);
	}
	
	public Cancion actualizaCancion(Cancion cancion) {
		return this.repositorioCanciones.save(cancion);
		
	}
	
	public void eliminaCancion(Long id) {
		this.repositorioCanciones.deleteById(id);
	}
	
	
	
	
}
