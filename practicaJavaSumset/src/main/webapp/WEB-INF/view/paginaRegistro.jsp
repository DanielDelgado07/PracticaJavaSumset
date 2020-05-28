<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Registro biblioteca</title>
</head>
<body>
	<form action="muestraFormularioRegistro" modelAtrribute="userDTO">

		<fieldset>

			<legend>Información personal</legend>

			<p>
				Nombre: <input type="text" path="nombre"/>
			</p>

			<p>
				Apellido: <input type="text" path="apellido">
			</p>

			<p>
				Edad: <input type="text"path="edad">
			</p>

			<p>
				UserName: <input type="text" path="userName">
			</p>

			<p>
				Contraseña: <input type="text" path="password">
			</p>
				
			<p>
				 <input type="submit" value="Enviar">
			</p>

		</fieldset>

	</form>
</body>
</html>