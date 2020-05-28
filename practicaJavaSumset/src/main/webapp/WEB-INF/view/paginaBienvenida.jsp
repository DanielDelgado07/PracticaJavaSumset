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
		<form action="principal/procesarFormulario" method="get">
			<p>
			Usuario:   <input type="text" name="nombreUsuario" > 
			<br><br>
			contraseña:<input type="password" name="password" > 
			<br><br>
			<a href="registro/muestraFormularioRegistro">Registrarse</a>
			<br><br>
			<input type="submit" value="Aceptar">
			<input type="submit" value="Cancelar">
		</p>
		</form>
		
		
	</Center>

</body>
</html>