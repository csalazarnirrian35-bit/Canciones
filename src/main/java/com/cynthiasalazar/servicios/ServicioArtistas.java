package com.cynthiasalazar.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cynthiasalazar.modelos.Artista;
import com.cynthiasalazar.repositorios.RepositorioArtistas;

@Service
public class ServicioArtistas {
	
	@Autowired
	private RepositorioArtistas repositorioArtistas;
	
	public List<Artista> obtenerTodosLosArtistas(){
		return this.repositorioArtistas.findAll();
	}

	public Artista obtenerArtistaPorId(Long id) {
		return repositorioArtistas.findById(id).orElse(null);
		
	}
	
	public Artista agregarArtista(Artista artista) {
		return repositorioArtistas.save(artista);
	}
	
	
}

