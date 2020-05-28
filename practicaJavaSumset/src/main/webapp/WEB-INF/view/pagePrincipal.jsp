<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina principal</title>
</head>
<body>
	Biblioteca municipal 
	<br>
	 ${param.nombreUsuario}.
	<p><br>
	<h2>Escoge un libro para prestar</h2>
	
	${mensajeClaro}
	</p>
	
	<!-- <img alt="foto" src="${pageContext.request.contextPath}/resources/booksImags/book1.jpg">
	 	 -->
</body>
</html>