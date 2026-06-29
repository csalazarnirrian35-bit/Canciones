<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agregar Canción</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<h1>Añadir Canción</h1>
	

	<form:form action="/canciones/procesa/agregar" method="POST" modelAttribute="addCancion">
		<form:label path="titulo">Título:</form:label>
		<form:input type="text" path="titulo"/>
		<form:errors path="titulo"/>
		
		<form:label path="artista">Artista:</form:label>
		<form:input type="text" path="artista"/>
		<form:errors path="artista"/> 
		
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