<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style.css" />
<link rel="stylesheet" href="styleheader.css" />
<title>Insertion Client</title>
</head>

<body>
	<ul>
		<li><a href="accueilConseiller.jsp">Accueil</a></li>
		<li><a href="ajouterClient.jsp">Ajouter un Client</a></li>
		<li><a href="ajouterCompte.jsp">Ajouter un Compte</a></li>
		<li style="float: right"><a class="active" href="ServletLogin">Déconnexion</a></li>
	</ul>

	<h2>Operation: Virement</h2>
	<form action="./OperRechercheServ" method="post">
		<p>
			<i>Insérez le montant que vous souhaitez virer vers le compte
				cible</i>
		</p>
		<fieldset>
			
			<label for="idClient">Numero Identifiant de Client</label> <input
				type="text" name="idClient" id="idClient" value=""><br>
			
		</fieldset>

		<p>
			<input type="submit" value="Soummettre">
		</p>
	</form>




</body>
</html>