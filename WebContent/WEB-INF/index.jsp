<!DOCTYPE html>
<html lang="fr">

<head>
	<title>toto</title>
	<meta name="description" content="">
	<meta name="keywords" content="">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="Content-Language" content="fr">
	
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
		rel="stylesheet" />
	<link type="text/css" rel="stylesheet" href="./css/materialize.css"
		media="screen,projection" />
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
					<img src="images/banniere.jpg"/>
				</div>
			</div>
			<!-- <div class="banniere row">
                <div class="col s12 m12"><span class="blue-text text-darken-2 ">Bienvenue Dans Les Alpes Maritimes</span></div>
        </div> -->
		</header>

		<c:import url="inc/menu.jsp"></c:import>

		<div class="container">
			<div class="slider">
				<ul class="slides">
					<li><img src="images/maison/vue.jpg"/>
						<div class="caption center-align">
							<h3>Vue Cap Ferrat</h3>

						</div></li>
					<li><img src="images/maison/jardin.jpg"/> <!-- random image -->
						<div class="caption left-align"></div></li>
					<li><img src="images/maison/vuemaison.jpg"/> <!-- random image -->
						<div class="caption right-align"></div></li>
					<li><img src="images/maison/salon.jpg"/> <!-- random image -->
						<div class="caption center-align"></div></li>
				</ul>
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