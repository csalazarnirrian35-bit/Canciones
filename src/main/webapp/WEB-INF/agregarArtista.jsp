<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agregar Artista</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	
	<h1>Agregar Artista</h1>
	

	<form:form action="/artistas/procesa/agregar" method="POST" modelAttribute="artista">
		<form:label path="nombre">Nombre:</form:label>
		<form:input type="text" path="nombre"/>
		<form:errors path="nombre"/>
		
		
		<form:label path="apellido">Apellido:</form:label>
		<form:input type="text" path="apellido"/>
		<form:errors path="apellido"/>
		
		<form:label path="biografia">Biografía:</form:label>
		<form:textarea path="biografia"></form:textarea>
		<form:errors path="biografia"/>
		
		<input type="submit" value="Agregar Artista">

		
	</form:form>
	
	<div class= "volver">
		<a href="/artistas">Volver a Lista de Artistas<span>&gt;&gt;</span></a>
	</div>



</body>
</html>