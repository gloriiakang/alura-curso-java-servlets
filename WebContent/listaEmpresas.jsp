<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
	<body>
		Lista de Empresas: <br/>
		
		<ul>
			<c:forEach items="${ empresas }" var="i">
				<li>${ i.nome } - <fmt:formatDate value="${ i.dataAbertura}" pattern="dd/MM/yyyy"/></li>
			</c:forEach>
		</ul>
			
	</body>
</html>