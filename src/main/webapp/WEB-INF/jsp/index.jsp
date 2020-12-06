<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<link rel="stylesheet" type="text/css"
	th:href="@{/webjars/bootstrap/3.3.7/css/bootstrap.min.css}" />

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Registration</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#" th:href="@{/}">Registration and
					Login Module</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li sec:authorize="isAuthenticated()"><a th:href="@{/logout}">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<br>
	<br>
	<div class="container">
		<h2>User Registration and Login Module using Spring Boot, Spring
			MVC, Spring Security, JPA/Hibernate and Thymeleaf</h2>

		<p>
			Welcome <span sec:authentication="principal.username">User</span>
		</p>
	</div>

<script src="https://code.jquery.com/jquery-migrate-3.3.2.min.js" integrity="sha256-Ap4KLoCf1rXb52q+i3p0k2vjBsmownyBTE1EqlRiMwA=" crossorigin="anonymous"></script>
	<script type="text/javascript"
		th:src="@{/webjars/jquery/3.2.1/jquery.min.js/}"></script>
	<script type="text/javascript"
		th:src="@{/webjars/bootstrap/3.3.7/js/bootstrap.min.js}"></script>

</body>
</html>
    