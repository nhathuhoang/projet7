<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des operations</h1>
<table>
<tr class="en-tete">
	<th>idClient</th>
	<th>Operation</th>
	<th>Date d'operation</th>
	<th>Numero identifiant du compte de depart</th>
	<th>Numero identifiant du compte d'arrivee</th>
	<th>Montant transfert</th>
	
</tr>
<c:forEach var="operation" items="${retour}">
<tr class="ligne-paire">
	<td> <c:out value="${operation.idClient}"/></td>
	<td><c:out value="${operation.type}"/></td>
	<td><c:out value="${operation.date}"/></td>
	<td><c:out value="${operation.idCompteDepart}"/></td>
	<td><c:out value="${operation.idCompteCible}"/></td>
	<td><c:out value="${operation.montant}"/></td>
<%-- 	<td><a href="ServletModifClient?idclient=${asd.idClient}" --%>
<!-- 		 class="btn btn-info" role="button">Modification</a></td> -->
<!-- <td><a href="#" -->
<!-- 		 class="btn btn-info" role="button">Virement</a></td> -->
<!--  	
	<td><a href="ServletVirement?idclient=${asd.idClient}"
		 class="btn btn-info" role="button">Virement</a></td>
	-->
</tr>


</c:forEach>
</body>
</html>