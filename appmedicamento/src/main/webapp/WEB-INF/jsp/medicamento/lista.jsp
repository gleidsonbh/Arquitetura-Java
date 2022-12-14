<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Medicamentos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h3>Medicamentos: ${listagem.size()}</h3>
		
		<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>ID</th>
		        <th>Descrição</th>
		        <th>Valor</th>
		        <th>Fabricante</th>
		        <th>Indicação</th>
		        <th>Composição</th>
		        <th>RMS</th>
		        <th><th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="m" items="${listagem}">
			      <tr>
			      	<td>${m.id}</td>
			        <td>${m.descricao}</td>
			        <td>${m.valor}</td>
			        <td>${m.fabricante}</td>
			        <td>${m.indicacao}</td>
			        <td>${m.composicao}</td>
			        <td>${m.rms}</td>
			        <td><a class="btn btn-danger" href="/medicamento/${m.id}/excluir">Excluir</a></td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>		
	</div>
</body>
</html>