<!DOCTYPE html>
<html lang="en">

<head>

<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href="./css/materialize.min.css"
	media="screen,projection" />
<link type="text/css" rel="stylesheet" href="./css/style.css" />
<!--Let browser know website is optimized for mobile-->
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
					<img src="./images/banniere.jpg">
				</div>
			</div>
		</header>

		<c:import url="inc/menu.jsp"></c:import>

		<p class="aligner">Photos Paysage Alpes Maritimes</p>
		<div class="carousel">
			<a class="carousel-item" href="#one!"> <img
				src="./images/region/mer.jpg"/>
			</a> <a class="carousel-item" href="#two!"> <img
				src="./images/region/montagne.jpg"/>
			</a> <a class="carousel-item" href="#three!"> <img
				src="./images/region/mercantour.jpeg"/>
			</a> <a class="carousel-item" href="#four!"> <img
				src="./images/region/neige.jpg"/>
			</a> <a class="carousel-item" href="#five!"> <img
				src="./images/region/montagne2.jpg"/>
			</a>

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