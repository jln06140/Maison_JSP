<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>

<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"
	media="screen,projection" />
<link type="text/css" rel="stylesheet" href="style/style.css" />
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

</head>

<body>
	<div class="contenu">

		<header>
			<div class="parallax-container">
				<div class="parallax">
					<img src="images/banniere.jpg">
				</div>
			</div>
			<!-- <div class="banniere row">
                <div class="col s12 m12"><span class="blue-text text-darken-2 ">Bienvenue Dans Les Alpes Maritimes</span></div>
        </div> -->
		</header>
		<nav>
			<div class="nav-wrapper light-blue darken-1">
				<a href="http://www.vence.fr/" class="brand-logo"> <img
					src="images/logo2.jpg" id="logo" />
				</a> <a href="#" data-activates="mobile-demo" class="button-collapse">
					<i class="material-icons">menu</i>
				</a>
				<ul class="right hide-on-med-and-down">
					<li><a href="index.html">Ma Maison</a></li>
					<li><a href="maregion.html">Ma Region</a></li>
					<li><a href="inscription">Inscription</a></li>
					<li><a href="listeClients">Gestion</a></li>
				</ul>
				<ul class="side-nav" id="mobile-demo">
					<li><a href="index.html">Ma Maison</a></li>
					<li><a href="maregion.html">Ma Region</a></li>
					<li><a href="inscription">Inscription</a></li>
					<li><a href="listeClients">Gestion</a></li>
				</ul>
			</div>
		</nav>



		<div class="container">
			<h5>Voici un recapitulatif de votre reservation : </h5>
			<p>Nom :</p>
			<c:out value="${reservation.client.nom }"></c:out>
			<p>Prenom :</p>
			<c:out value="${reservation.client.prenom }"></c:out>
			<p>Email :</p>
			<c:out value="${reservation.client.email }"></c:out>
			<p>Telephone :</p>
			<c:out value="${reservation.client.telephone }"></c:out>
			<p>Nombre de personnes :</p>
			<c:out value="${reservation.nombrePersonnes }"></c:out>
			<p>Nombre de nuits :</p>
			<c:out value="${reservation.nombreNuitees }"></c:out>
			<p>Type de sejour :</p>
			<c:out value="${reservation.typeSejour }"></c:out>
		</div>

		<footer class="page-footer light-blue darken-1">
			<div class="container">
				<div class="row">
					<div class="col l6 s12"></div>
					<div class=" col l4 offset-l2 s12">
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

	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
	<script type="text/javascript" src="js/maison.js"></script>
</body>

</html>