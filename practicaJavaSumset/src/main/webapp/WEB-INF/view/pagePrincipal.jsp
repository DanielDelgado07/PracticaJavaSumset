<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina principal</title>
</head>
<body>
<h2>Pagina principal</h2>
	
	Selecciona una categoria
	<form action="../../form-result.php" target="_blank">

  <p>

    Selecciona categor�as:<br>

    <select multiple name="categorias[]">

      <option value="arte">Arte</option>

      <option value="CienciaFiccion">Ciencia Ficci�n</option>

      <option value="ninos">Ni�os y adolescentes</option>

      <option value="hazlotu">Hazlo tu mismo</option>
      
        <option value="salud">Salud</option>

    </select>

  </p>

  <p><input type="submit" value="Enviar informaci�n"></p>

</form>
	<br>
	 ${param.nombreUsuario}.
	<p><br>
	
	${mensajeClaro}
	</p>
	
	<!-- <img alt="foto" src="${pageContext.request.contextPath}/resources/booksImags/book1.jpg">
	 	 -->
</body>
</html>