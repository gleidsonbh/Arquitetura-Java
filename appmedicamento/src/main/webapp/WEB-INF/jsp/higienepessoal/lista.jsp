<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Higiene Pessoal</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h3>Higiene Pessoal</h3>
		
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Descrição</th>
		        <th>Valor</th>
		        <th>Fabricante</th>
		        <th>Precauções</th>
		        <th>Perfil</th>
		        <th>Gênero</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="h" items="${listagem}">
			      <tr>
			        <td>${h.id}</td>
			        <td>${h.descricao}</td>
			        <td>${h.valor}</td>
			        <td>${h.fabricante}</td>
			        <td>${h.precaucoes}</td>
			        <td>${h.perfil}</td>
			        <td>${h.genero}</td>
			        <td><a class="btn btn-danger" href="/higienepessoal/${h.id}/excluir">Excluir</a></td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>	
		  		
	</div>
</body>
</html>