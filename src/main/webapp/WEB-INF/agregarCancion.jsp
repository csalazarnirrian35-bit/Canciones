<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agregar Canción</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<h1>Añadir Canción</h1>
	

	<form:form action="/canciones/procesa/agregar" method="POST" modelAttribute="cancion">
		<form:label path="artista">Elige tu Artista:</form:label>
		<form:select path="artista" id="artista" required="true">
			<form:option value="">Seleccionar Artista</form:option>
			<c:forEach var="artista" items="${listaArtistas}">
				<form:option value="${artista.id}">${artista.nombre} ${artista.apellido}</form:option>
			</c:forEach>
		</form:select>
		<form:errors path="artista" />
			
		
		<form:label path="titulo">Título:</form:label>
		<form:input type="text" path="titulo"/>
		<form:errors path="titulo"/>
		
		
		
		
		<form:label path="album">Álbum:</form:label>
		<form:input type="text" path="album"/>
		<form:errors path="album"/>
		
		<form:label path="genero">Género:</form:label>
		<form:input type="text" path="genero"/>
		<form:errors path="genero"/> 
		
		<form:label path="idioma">Idioma:</form:label>
		<form:input type="text" path="idioma"/>
		<form:errors path="idioma"/>
		
		<input type="submit" value="Agregar Canción">

		
	</form:form>
	
	<div class= "volver">
		<a href="/canciones">Volver a Lista de Canciones<span>&gt;&gt;</span></a>
	</div>
	
</body>
</html>