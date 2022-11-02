<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" />
<title>Cadastramento de Dermocosméticos</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Dermocosméticos</h3>
		
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Descrição</th>
		        <th>Valor</th>
		        <th>Fabricante</th>
		        <th>Modo de usar</th>
		        <th>Avaliação</th>
		        <th>Categoria</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="d" items="${listagem}">
			      <tr>
			        <td>${d.id}</td>
			        <td>${d.descricao}</td>
			        <td>${d.valor}</td>
			        <td>${d.fabricante}</td>
			        <td>${d.modoDeUsar}</td>
			        <td>${d.avaliacao}</td>
			        <td>${d.categoria}</td>
			        <td><a class="btn btn-danger" href="/dermocosmetico/${d.id}/excluir">Excluir</a></td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>	
		  		
	</div>
</body>
</html>