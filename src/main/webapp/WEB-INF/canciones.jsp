<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Canciones</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<h1>Lista de Canciones</h1>
	
	<div class="lista">
	<table>
		<thead>
			<tr>
			<th>Titulo</th>
			<th>Artista</th>
			<th>Detalle</th>
			</tr>
		</thead>
	
		<tbody >
		 	<c:forEach var="cancion" items="${listaCanciones}">
				<tr>
					<td>${cancion.titulo}</td>
					<td>${cancion.artista}</td>
					<td>
						<a href="/canciones/detalle/${cancion.id}">Detalle</a>
					</td>
				</tr>
		 	</c:forEach>
		</tbody>
	</table>
	</div>				
	<div class="boton1">	
		<a href="/canciones/formulario/agregar"><button>Añadir Canción<span>&#9834;&#9834;</span></button></a>			 	
	</div>
</body>
</html>