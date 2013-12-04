<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Primer JSP</title>
</head>
<body>
	<H1>
		<c:out value="${param1}" />
	</H1>
	<table>
		<tr>
			<!-- Recuperación de parámetros con JSTL -->
			<td>Recuperación de parámetros con JSTL</td>
			<td><c:out value="${param1}" /></td>
		</tr>		
		<tr>
			<!-- Recuperación de parámetros con Expression Language -->
			<td>Recuperación de parámetros con Expression Language</td>
			<td>${param1}</td>
		</tr>
		<tr>
			<!-- Recuperación de propiedades de objeto con JSTL -->	
			<td>Recuperación de propiedades de objeto con JSTL</td>
			<td>
				<%-- Agregar código para Ejercicio 1.c --%>
			</td>
		</tr>				
	</table>
</body>
</html>
