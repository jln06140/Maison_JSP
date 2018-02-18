<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<title>Maison d'hotes</title>
	<meta name="description" content="">
	<meta name="keywords" content="">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="Content-Language" content="fr">

	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" />
	<link type="text/css" rel="stylesheet" href="./css/materialize.css" media="screen,projection" />
	<link type="text/css" rel="stylesheet" href="./css/style.css" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>

<body>
	<div class="contenu">
		<script type="text/javascript"
			src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="js/materialize.min.js"></script>
		<script type="text/javascript" src="js/maison.js"></script>

		<header>
			<div class="parallax-container">
				<div class="parallax">
					<img src="images/banniere.jpg">
				</div>
			</div>
		</header>

		<c:import url="inc/menu.jsp"></c:import>

		<div class="container">
<%-- 		
		<%-- <!-- Si utilistateur admin non connecté a alors formulaire de connexion -->
			<c:choose>
				<c:when test="${!estConnecte}">
					<c:import url="inc/connexion.jsp"></c:import>
				</c:when>

				<c:otherwise> --%>

	    <!-- Si utilistateur admin identifié et connecté  -->
	 				<%-- <c:choose> --%>
						<%-- <c:when test="${acces }"> --%>

							<table border=1 class="responsive-table bordered">
								<thead>
									<tr>
										<th>Nom</th>
										<th>Prenom</th>
										<th>Email</th>
										<th>Telephone</th>
										<th>Departement</th>
										<!-- <th>nombre Personnes</th>
										<th>nombre Nuitées</th>
										<th>Options</th>
										<th>Type Sejour</th> -->
									</tr>
								</thead>

								<tbody>
									<c:forEach var="client" items="${clients}">
										<tr>
											<td><c:out value="${client.nom }"></c:out></td>
											<td><c:out value="${client.prenom }"></c:out></td>
											<td><c:out value="${client.email }"></c:out></td>
											<td><c:out value="${client.telephone }"></c:out></td>
											<td><c:out value="${client.departement }"></c:out></td>
											<%-- <td><c:out value="${reserv.nombrePersonnes }"></c:out>
											<td><c:out value="${reserv.nombreNuitees }"></c:out>
											<td><c:forEach var="option" items="${$reserv.option }">${option.name }</c:forEach></td>

											<td><c:out value="${reserv.typeSejour }" /></td> --%>
										</tr>
									</c:forEach>
								</tbody>

							</table>
						<%--</c:when>
						 <c:otherwise>
							<span class="interdit">Vous n'avez pas acces a cette page</span>
						</c:otherwise> --%>
					<%-- </c:choose>  --%>
			
			<div class = "row center">
				<a class="waves-effect waves-light btn" href="inscription">retour a la page inscription</a>
		
			<a class="waves-effect waves-light btn" href="listeClients?deco=true">Se deconnecter</a>
			</div>
		</div>



		<footer class="page-footer light-blue darken-1">
			<div class="container">
				<div class="row">
					<div class="col l6 s12"></div>
					<div class="col l4 offset-l2 s12">
						<h5 class="white-text">Reseaux Sociaux</h5>
						<ul class="valign" id="menubas">
							<li><a class="grey-text text-lighten-3" href="#!"><img
									src="images/icones/facebook.png"></a></li>
							<li><a class="grey-text text-lighten-3" href="#!"><img
									src="images/icones/twitter.png"></a></li>
							<li><a class="grey-text text-lighten-3" href="#!"><img
									src="images/icones/pinterest.png"></a></li>
							<li><a class="grey-text text-lighten-3" href="#!"><img
									src="images/icones/youtube.png"></a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="footer-copyright"></div>
		</footer>
	</div>
</body>

</html>