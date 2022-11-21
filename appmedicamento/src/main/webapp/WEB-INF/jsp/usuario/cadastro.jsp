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
		<form action="/usuario/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> <input type="text"
					class="form-control" placeholder="Digite o seu nome"
					name="nome">
			</div>		
			<div class="form-group">
				<label>E-mail:</label> <input type="email"
					class="form-control" placeholder="Digite o seu e-mail"
					name="email">
			</div>
			<div class="form-group">
				<label>Senha:</label> <input type="password"
					class="form-control" placeholder="Digite sua senha"
					name="senha">
			</div>
			<button type="submit" class="btn btn-default">Salvar</button>
		</form>

	</div>
</body>
</html>