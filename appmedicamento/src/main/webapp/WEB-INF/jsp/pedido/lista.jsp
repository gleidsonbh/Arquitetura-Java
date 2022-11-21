<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Pedidos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h3>Pedidos</h3>
		<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Código</th>
		        <th>Frete Grátis</th>
		        <th>Tipo de Entrega</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="p" items="${listagem}">
			      <tr>
			      	<td>${p.id}</td>
			        <td>${p.codigo}</td>
			        <td>${p.freteGratis}</td>
			        <td>${p.tipoEntrega}</td>
			        <td><a class="btn btn-danger" href="/pedido/${p.id}/excluir">Excluir</a></td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>	
		  		
	</div>
</body>
</html>