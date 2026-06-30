<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Editar Canción</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<h1>Editar Canción</h1>
	<form:form action="/canciones/procesa/editar/${cancion.id}" method="POST" modelAttribute="cancion">
		<input type="hidden" name="_method" value="PUT"/>
	
		<input type="hidden" value="${cancion.id}" name="id"/>
		<%-- <input type="hidden" value="${cancion.fechaCreacion}" name="fechaCreacion"/>
		<input type="hidden" value="${cancion.fechaActualizacion}" name="fechaActualizacion"/>--%>
		
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
		
		<input type="submit" value="Editar Canción">

	</form:form>
	
	<div class= "volver">
		<a href="/canciones">Volver a Lista de Canciones<span>&gt;&gt;</span></a>
	</div>



</body>
</html>