<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" />
<title>Cadastramento de Clientes</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Clientes</h3>
		
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>Nome</th>
		        <th>Idade</th>
		        <th>Cidade</th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="cl" items="${listagem}">
			      <tr>
			        <td>${cl.nome}</td>
			        <td>${cl.idade}</td>
			        <td>${cl.cidade}</td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>		
		
		
	</div>
</body>
</html>