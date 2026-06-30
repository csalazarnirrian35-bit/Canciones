<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Detalle Cancion</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body id="detalles">
	
    <h1>Detalle de Canción</h1>
	<div class="contenedor">
        
        <h2>${cancion.titulo}</h2>
        <p>Título</p>
        <div class="contenedor1">
            <p>Artista:</p>
            <h4><b>${cancion.artista}</b></h4>
            
            <p>Álbum:</p>
            <h4><b>${cancion.album}</b></h4>
        </div>

        <div class="contenedor1">
            <p>Género:</p>
            <h4><b>${cancion.genero}</b></h4>
            
            <p>Idioma:</p>
            <h4><b>${cancion.idioma}</b></h4>
        </div>
		<a href="/canciones/formulario/editar/${cancion.id}"><button>Editar Canción</button></a>
    </div>
	<div class="volver">
	<a href="/canciones">Volver a Lista de Canciones<span>&gt;&gt;</span></a>
	</div>	
		
    
</body>
</html>