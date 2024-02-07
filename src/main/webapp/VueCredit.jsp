<%@page import="web.CreditModel"%>
<%
CreditModel model = (CreditModel)request.getAttribute("creditModel");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Credit bancaire</title>
</head>
<body>
	<div>
		<form action="calcule.do" method="post">
			<table>
				<tr>
					<td>Montant:</td>
					<td><input type="text" name="montant" /></td>
					<td>DH</td>
				</tr>
				<tr>
					<td>Taux:</td>
					<td><input type="text" name="taux" /></td>
					<td>%</td>
				</tr>
				<tr>
					<td>Duree:</td>
					<td><input type="text" name="duree" /></td>
					<td>Mois</td>
				</tr>
			</table>
			<button type="submit">calculer</button>
		</form>
	</div>
	<p></p>
	<div>
		  Mensualite = <% out.println(model.getResultat()); %>  
	</div>
</body>
</html>