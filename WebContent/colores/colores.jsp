<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Colores</title>

<link rel="stylesheet" href="/LabJavaAppWeb/css/color_.css" type="text/css" /> <%--Modificar línea para Ejercicio 2 --%>

<script type="text/javascript" src="/LabJavaAppWeb/js/jquery-1.10.2.js"></script>	
<script type="text/javascript">
	$(function() {		
		var $colorElegido = $('body').css('background-color');		
		if($colorElegido == 'rgb(0, 0, 255)' || $colorElegido == 'blue') {
			$('option#azul').prop('selected', true);
		} else if($colorElegido == 'rgb(0, 128, 0)' || $colorElegido == 'green') {
			$('option#verde').prop('selected', true);
		} else if($colorElegido == 'rgb(255, 0, 0)'  || $colorElegido == 'red') {
			$('option#rojo').prop('selected', true);
		}
	});
</script>	
</head>
<body>
	<form method="POST" action="/LabJavaAppWeb/ColoresServlet">
		<table>
			<tr>
				<td>
					<select id="colores" name="colores">
						<option id="rojo" value="rojo">rojo</option>
						<option id="verde" value="verde">verde</option>
						<option id="azul" value="azul">azul</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" name="submit" value="Enviar" />				
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
