<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>appWeb</title>
<script type="text/javascript" src="/LabJavaAppWeb/js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="/LabJavaAppWeb/js/jquery.validate.js"></script>
<link rel="stylesheet" href="boostrap/css/bootstrap.min.css">
<link rel="stylesheet" href="boostrap/css/bootstrap-theme.min.css">
<script src="boostrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/LabJavaAppWeb/css/jqueryValidate.css" type="text/css" />
<script type="text/javascript">
$(document).ready(function(){ 	
	$('#appWebForm').validate({
		rules : {
			nombreArcade : {
				minlength : 3,
				maxlength : 20,
				required : true
			},
			companiaArcade : {
				minlength : 2,
				maxlength : 20,
				required : true,
			},
			edicionArcade : {
				minlength : 4,
				maxlength : 4,
				required : true,
				number: true
			}
		},
		messages: {
			nombreArcade: {
                required: "Por favor especifique nombre del juego",
                minlength: "Por favor especifique al menos 3 caracteres para identificar el nombre",
                maxlength: "Por favor especifique hasta 20 caracteres para identificar el nombre"
            },
            companiaArcade: {
                required: "Por favor especifique compania",
                minlength: "Por favor especifique al menos 2 caracteres para identificar la compania",
                maxlength: "Por favor especifique hasta 20 caracteres para identificar la compania"
            },
            edicionArcade: {
                required: "Por favor especifique el año de edición",
                minlength: "Por favor especifique el año con 4 dígitos",
                maxlength: "Por favor especifique el año con 4 dígitos",                
                number: "Por favor especifique un valor numérico"
            }
        },
        highlight: function(element) {
        	$(element).closest('.control-group').removeClass('success').addClass('error');
        },
        success: function(element) {
        	element.text('OK!').addClass('valid').closest('.control-group').removeClass('error').addClass('success');
        }
	});	
});
</script>
	
</head>
<body class="container">
<div class="control-group span 12">
	<form method="POST" action="/LabJavaAppWeb/AppWebServlet" id="appWebForm" class="form-horizontal">
		<fieldset>
			<legend>
				Alta de Arcades 
			</legend>
			<div class="control-group">
				<label class="control-label" for="nombreArcade">Nombre
					Arcade</label>
				<div class="controls">
					<input type="text" class="input-xlarge" name="nombreArcade"
						id="nombreArcade">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="email">Compania</label>
				<div class="controls">
					<input type="text" class="input-xlarge" name="companiaArcade"
						id="companiaArcade">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="subject">Año de Edición</label>
				<div class="controls">
					<input type="text" class="input-xlarge" name="edicionArcade"
						id="edicionArcade">
				</div>
			</div>
			<label class="control-label" for="estadoArcade">Estado</label>
			<div class="controls">
				<select id="estadoArcade" name="estadoArcade" class="selectpicker show-tick">
					<c:forEach var="objetoComboEstado" items="${requestScope['listaComboEstado']}">
						<option id="${objetoComboEstado.descComboEstado}" value="${objetoComboEstado.id_comboEstado}">${objetoComboEstado.descComboEstado}</option>
					</c:forEach>
				</select>
			</div>
			<div class="controls">
				<hr>
			</div>			
			<div class="form-actions">
				<input type="hidden" name="comando" id="Insertar" value="Insertar" />
				<button type="submit" class="btn btn-primary btn-large">Agregar</button>
				<button type="reset" class="btn">Cancelar</button>
			</div>
		</fieldset>
	</form>
</div>
<div class="control-group span 12">	
	<fieldset>
		<legend>
			Lista de Arcades
		</legend>
		<table class="table table-striped table-hover">
			<thead>
			<tr>
				<td></td>
				<td><b>Id</b></td>
				<td><b>Nombre Arcade</b></td>
				<td><b>Compania</b></td>
				<td><b>Año</b></td>
				<td><b>Estado</b></td>			
			</tr>
			</thead>
				<%-- Implementar código para Ejercicio 3.c --%>
				<c:forEach var="objetoArcade" items="${requestScope['listaObjetosArcade']}">
					<tr>
						<td><a href="/LabJavaAppWeb/AppWebServlet?comando=Borrar&id=<c:out value="${objetoArcade.id_juegoArcade}"/>">Borrar</a></td>
						<td><c:out value="${objetoArcade.id_juegoArcade}" /></td>
						<td><c:out value="${objetoArcade.nombreArcade}" /></td>
				 		<td><c:out value="${objetoArcade.companiaArcade}" /></td>
						<td><c:out value="${objetoArcade.anioEdicion}" /></td>
						<td><c:out value="${objetoArcade.comboEstadoBean.descComboEstado}" /></td>			
					</tr>
				</c:forEach>
		</table>
	</fieldset>
</div>	
</body>
</html>