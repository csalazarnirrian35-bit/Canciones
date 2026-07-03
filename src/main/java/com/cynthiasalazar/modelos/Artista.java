package com.cynthiasalazar.modelos;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="artistas")
public class Artista {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_artista")
	private Long id;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 3, message = "Debe tener al menos 3 caracteres.")
	private String nombre;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 3, message = "Debe tener al menos 3 caracteres.")
	private String apellido;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min= 10, message = "Debe tener minimo 10 caracteres.")
	private String biografia;
	
	@CreationTimestamp
	@Column(updatable = false, name="fecha_creacion")
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate fechaCreacion;
	
	@UpdateTimestamp
	@Column(name="fecha_actualizacion")
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate fechaActualizacion;
	
	
	@OneToMany(mappedBy = "artista")
	private List<Cancion> canciones;
	
	
	public Artista() {
		
	}

	

	public Artista(Long id, String nombre, String apellido, String biografia,  List<Cancion> canciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.biografia = biografia;
		this.canciones = canciones;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getBiografia() {
		return biografia;
	}


	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}


	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}


	public void setFechaActualizacion(LocalDate fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}


	public List<Cancion> getCanciones() {
		return canciones;
	}


	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}



	@Override
	public String toString() {
		return "Artista [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", biografia=" + biografia
				+ ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion=" + fechaActualizacion + ", canciones="
				+ canciones + "]";
	}
	
	
	
	
	
}
