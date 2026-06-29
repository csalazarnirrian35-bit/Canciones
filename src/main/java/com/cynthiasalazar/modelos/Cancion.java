package com.cynthiasalazar.modelos;



import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="canciones")
public class Cancion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cancion")
	private Long id;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private String artista;
	
	@Column(nullable = false)
	private String album;

	@Column(nullable = false)
	private String genero;
	
	@Column(nullable = false)
	private String idioma;
	
	@CreationTimestamp
	@Column(updatable = false, name="fecha_creacion")
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate fechaCreacion;
	
	@UpdateTimestamp
	@Column(name="fecha_actualizacion")
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate fechaActualizacion;
	
	
	public Cancion() {
	
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public Long getId() {
		return id;
	}


	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}


	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	
		
	
}
