<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Artistas</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<h1>Artistas</h1>
		
			<c:forEach var="artista" items="${listaArtistas}">
				<ul>
					<li><a href="/artistas/detalle/${artista.id}">${artista.nombre} ${artista.apellido}</a></li>
				</ul>
			</c:forEach>		
				
			<a href="/artistas/formulario/agregar"><button>Agregar Artista</button></a>	
		
	<div class= "volver">
	  <a href="/canciones">Ir a canciones</a>	
	</div>
</body>
</html>