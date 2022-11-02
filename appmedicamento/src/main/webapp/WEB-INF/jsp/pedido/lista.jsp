<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" />
<title>Cadastramento de Pedidos</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Pedidos</h3>
		<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Código</th>
		        <th>Frete Grátis</th>
		        <th>Tipo de Entrega</th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="p" items="${listagem}">
			      <tr>
			      	<td>${p.id}</td>
			        <td>${p.codigo}</td>
			        <td>${p.freteGratis}</td>
			        <td>${p.tipoEntrega}</td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>	
		  		
	</div>
</body>
</html>