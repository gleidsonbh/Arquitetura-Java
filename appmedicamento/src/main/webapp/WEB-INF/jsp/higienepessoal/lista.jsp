<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" />
<title>Cadastramento de Higiene Pessoal</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Higiene Pessoal</h3>
		
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>Descrição</th>
		        <th>Valor</th>
		        <th>Fabricante</th>
		        <th>Precauções</th>
		        <th>Perfil</th>
		        <th>Gênero</th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="m" items="${listagem}">
			      <tr>
			        <td>${m.descricao}</td>
			        <td>${m.valor}</td>
			        <td>${m.fabricante}</td>
			        <td>${m.precaucoes}</td>
			        <td>${m.perfil}</td>
			        <td>${m.genero}</td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>	
		  		
	</div>
</body>
</html>