<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Usuário</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">

		<h2>Usuário</h2>
		<form action="/cliente/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> <input type="text"
					class="form-control" placeholder="Digite o seu nome"
					name="nome">
			</div>		
			<div class="form-group">
				<label>Cidade:</label> <input type="text"
					class="form-control" placeholder="Digite a sua cidade"
					name="cidade">
			</div>
			<div class="form-group">
				<label>Idade:</label> <input type="number"
					class="form-control" placeholder="Digite a sua idade"
					name="idade">
			</div>
			<button type="submit" class="btn btn-default">Salvar</button>
		</form>

	</div>
</body>
</html>