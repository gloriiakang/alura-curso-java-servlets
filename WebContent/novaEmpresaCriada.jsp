<!-- Java Server Page: JSP -->
<!-- Scriptlet -->
<%
	String nomeEmpresa = (String)request.getAttribute("empresaApelido");
	System.out.println(nomeEmpresa);
%>

<html>
	<body>
		<!-- Empresa <% out.println(nomeEmpresa); %> cadastrada com sucesso! -->
		Empresa <%= nomeEmpresa %> cadastrada com sucesso!
	</body>
</html>
