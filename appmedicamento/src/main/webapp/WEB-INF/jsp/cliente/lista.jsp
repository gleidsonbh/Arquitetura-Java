<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Clientes</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h3>Clientes: ${listagem.size()}</h3>
		<h4><a href="/cliente">Novo cliente</a></h4>
		<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Nome</th>
		        <th>Idade</th>
		        <th>Cidade</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="cl" items="${listagem}">
			      <tr>
			        <td>${cl.id}</td>
			        <td>${cl.nome}</td>
			        <td>${cl.idade}</td>
			        <td>${cl.cidade}</td>
			        <td><a class="btn btn-danger" href="/cliente/${cl.id}/excluir">Excluir</a></td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>		
		
		
	</div>
</body>
</html>