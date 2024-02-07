<%@page import="web.CreditModel"%>
<%
CreditModel model = (CreditModel)request.getAttribute("creditModel");
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Credit bancaire</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="calcule.do" method="post">
			<table class="table table-primary">
				<tr>
					<td>Montant:</td>
					<td><input type="text" name="montant" value="<%= model.getMontant()%>" /></td>
					<td>DH</td>
				</tr>
				<tr>
					<td>Taux:</td>
					<td><input type="text" name="taux" value="<%= model.getTaux()%>" /></td>
					<td>%</td>
				</tr>
				<tr>
					<td>Duree:</td>
					<td><input type="text" name="duree" value="<%= model.getDuree()%>" /></td>
					<td>Mois</td>
				</tr>
			</table>
			<button type="submit" button" class="btn btn-primary">calculer</button>
		</form>
	</div>
	<p></p>
	<div class="container">
		  Mensualite = <% out.println(model.getResultat()); %>  
	</div>
</body>
</html>