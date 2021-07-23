<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
		<c:if test="${ not empty empresaApelido }">
			Empresa ${ empresaApelido } cadastrada com sucesso!
		</c:if>
		
		<c:if test="${ empty empresaApelido }">
			Nenhuma empresa cadastrada!
		</c:if>
		
	</body>
</html>
