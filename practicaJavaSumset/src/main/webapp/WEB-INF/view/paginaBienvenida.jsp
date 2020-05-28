<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>inicio sesion</title>
</head>
<body>
	<Center>
		<h2>BIBLIOTECA MUNICIPAL</h2>
		<br>
		<form action="procesarFormulario" method="get">
			<br>
			Usuario:
			<input type="text" name="nombreUsuario" > 
			<br><br>
			contraseña:
			<input type="text" name="password" > 
			<br><br>
			<a href="pageRegistroBiblioteca">Registrarse</a>
			<br>
			<input type="submit">
		</form>
		
		
	</Center>

</body>
</html>