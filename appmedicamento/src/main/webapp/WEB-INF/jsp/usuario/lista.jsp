<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de usuários</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h3>Usuários</h3>
		
		<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Nome</th>
		        <th>Email</th>
		        <th>Senha</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="cl" items="${listagem}">
			      <tr>
			        <td>${cl.id}</td>
			        <td>${cl.nome}</td>
			        <td>${cl.email}</td>
			        <td>${cl.senha}</td>
			        <td><a class="btn btn-danger" href="/usuario/${cl.id}/excluir">Excluir</a></td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>		
		
		
	</div>
</body>
</html>