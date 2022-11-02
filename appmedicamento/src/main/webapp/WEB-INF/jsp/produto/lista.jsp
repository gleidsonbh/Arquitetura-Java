<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" />
<title>Cadastramento de Produtos</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Produtos</h3>
		
		<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Descrição</th>
		        <th>Valor</th>
		        <th>Fabricante</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="´p" items="${listagem}">
			      <tr>
			      	<td>${p.id}</td>
			        <td>${p.descricao}</td>
			        <td>${p.valor}</td>
			        <td>${p.fabricante}</td>
			        <td><a class="btn btn-danger" href="/produto/${p.id}/excluir">Excluir</a></td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>			
		
	</div>
</body>
</html>