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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="canciones")
public class Cancion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cancion")
	private Long id;
	
    @NotNull(message = "Este campo es obligatorio.")
    @Size(min = 5, message = "Debe tener al menos 5 caracteres")
	private String titulo;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 3, message = "Debe tener al menos 3 caracteres.")
	private String artista;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 3, message = "Debe tener al menos 3 caracteres.")
	private String album;

	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 3, message = "Debe tener al menos 3 caracteres.")
	private String genero;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 3, message = "Debe tener al menos 3 caracteres.")
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

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}


	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	
		
	
}
