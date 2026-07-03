<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Detalle Artista</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<h1>Detalle Artista</h1>
	
	<div class="contenedorArt">
	    <p>Nombre:</p>
		<h3>${artista.nombre}</h3>
	       
	    <p>Apellido:</p>
	    <h3><b>${artista.apellido}</b></h3>
    </div>  
    
    <div class="biografia">
         <p>Biografía:</p>
         <h4><b>${artista.biografia}</b></h4>
        
	</div>
    <div class="cancionArtis">
         <p>Canciones:</p>
         <c:forEach var="cancion" items="${artista.canciones}">
            <li>${cancion.titulo}</li>
         </c:forEach>
    </div>
    
    <div class= "volver">
           <a href="/artistas">Volver a lista de artistas</a>
    </div>       
           
           
</body>
</html>