<!DOCTYPE html>
<html lang="fr">

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
		<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="js/materialize.min.js"></script>
		<script type="text/javascript" src="js/maison.js"></script>

		<header>
			<div class="parallax-container">
				<div class="parallax">
					<img src="images/banniere.jpg" alt="" />
				</div>
			</div>
			<!-- <div class="banniere row">
                <div class="col s12 m12"><span class="blue-text text-darken-2 ">Bienvenue Dans Les Alpes Maritimes</span></div>
        </div> -->
		</header>

		<c:import url="inc/menu.jsp" />

		<div class="row s4 offset-s4">
			<span class="erreur col s4 offset-s4">
				<c:out value="${message }" />
			</span>
		</div>

		<div class="row ">
			<form method="POST" class="col s12 m4 offset-m2" action="inscription" name="inscription">
				<fieldset class="formulaire">
					<legend>Informations Personelles</legend>



					<i class="material-icons prefix">account_box</i>
					<label for="nom">Nom:</label>
					<input type="text" id="nom" name="nom" />

					<i class="material-icons prefix">edit</i>
					<label for="prenom">Prenom : </label>
					<input type="text" id="prenom" name="prenom" />

					<i class="material-icons prefix">mail</i>
					<label for="email">email : </label>
					<input type="email" id="email" name="email" value="" class="validate" pattern="(^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$)"
					 required />

					<i class="icones material-icons prefix">phone</i>
					<label for="telephone">Telephone : </label>
					<input type="text" id="telephone" name="telephone" value="" />

					<div class="browser-default col s12">
						<select name="departements" id="departements" onClick="document.inscription.codepostal.value=document.inscription.departements.value;">
							<option value="" disabled selected>Departement</option>
							<option value="0"></option>
							<option value="01">01 - Ain</option>
							<option value="02">02 - Aisne</option>
							<option value="03">03 - Allier</option>
							<option value="04">04 - Alpes-de-Haute-Provence</option>
							<option value="05">05 - Hautes-Alpes</option>
							<option value="06">06 - Alpes-Maritimes</option>
							<option value="07">07 - Ardeche</option>
							<option value="08">08 - Ardennes</option>
							<option value="09">09 - Ariege</option>
							<option value="10">10 - Aube</option>
							<option value="11">11 - Aude</option>
							<option value="12">12 - Aveyron</option>
							<option value="13">13 - Bouches-du-Rhone</option>
							<option value="14">14 - Calvados</option>
							<option value="15">15 - Cantal</option>
							<option value="16">16 - Charente</option>
							<option value="17">17 - Charente-Maritime</option>
							<option value="18">18 - Cher</option>
							<option value="19">19 - Correze</option>
							<option value="2A">2A - Corse-du-Sud</option>
							<option value="2B">2B - Haute-Corse</option>
							<option value="21">21 - Cote-d'Or</option>
							<option value="22">22 - Cotes-d'Armor</option>
							<option value="23">23 - Creuse</option>
							<option value="24">24 - Dordogne</option>
							<option value="25">25 - Doubs</option>
							<option value="26">26 - Drome</option>
							<option value="27">27 - Eure</option>
							<option value="28">28 - Eure-et-Loir</option>
							<option value="29">29 - Finistere</option>
							<option value="30">30 - Gard</option>
							<option value="31">31 - Haute-Garonne</option>
							<option value="32">32 - Gers</option>
							<option value="33">33 - Gironde</option>
							<option value="34">34 - Herault</option>
							<option value="35">35 - Ille-et-Vilaine</option>
							<option value="36">36 - Indre</option>
							<option value="37">37 - Indre-et-Loire</option>
							<option value="38">38 - Isere</option>
							<option value="39">39 - Jura</option>
							<option value="40">40 - Landes</option>
							<option value="41">41 - Loir-et-Cher</option>
							<option value="42">42 - Loire</option>
							<option value="43">43 - Haute-Loire</option>
							<option value="44">44 - Loire-Atlantique</option>
							<option value="45">45 - Loiret</option>
							<option value="46">46 - Lot</option>
							<option value="47">47 - Lot-et-Garonne</option>
							<option value="48">48 - Lozere</option>
							<option value="49">49 - Maine-et-Loire</option>
							<option value="50">50 - Manche</option>
							<option value="51">51 - Marne</option>
							<option value="52">52 - Haute-Marne</option>
							<option value="53">53 - Mayenne</option>
							<option value="54">54 - Meurthe-et-Moselle</option>
							<option value="55">55 - Meuse</option>
							<option value="56">56 - Morbihan</option>
							<option value="57">57 - Moselle</option>
							<option value="58">58 - Nievre</option>
							<option value="59">59 - Nord</option>
							<option value="60">60 - Oise</option>
							<option value="61">61 - Orne</option>
							<option value="62">62 - Pas-de-Calais</option>
							<option value="63">63 - Puy-de-Dome</option>
							<option value="64">64 - Pyrenees-Atlantiques</option>
							<option value="35">65 - Hautes-Pyrenees</option>
							<option value="66">66 - Pyrenees-Orientales</option>
							<option value="67">67 - Bas-Rhin</option>
							<option value="68">68 - Haut-Rhin</option>
							<option value="69">69 - Rhone</option>
							<option value="70">70 - Haute-Saone</option>
							<option value="71">71 - Saone-et-Loire</option>
							<option value="72">72 - Sarthe</option>
							<option value="73">73 - Savoie</option>
							<option value="74">74 - Haute-Savoie</option>
							<option value="75">75 - Paris</option>
							<option value="76">76 - Seine-Maritime</option>
							<option value="77">77 - Seine-et-Marne</option>
							<option value="78">78 - Yvelines</option>
							<option value="79">79 - Deux-Sevres</option>
							<option value="80">80 - Somme</option>
							<option value="81">81 - Tarn</option>
							<option value="82">82 - Tarn-et-Garonne</option>
							<option value="83">83 - Var</option>
							<option value="84">84 - Vaucluse</option>
							<option value="85">85 - Vendee</option>
							<option value="86">86 - Vienne</option>
							<option value="87">87 - Haute-Vienne</option>
							<option value="88">88 - Vosges</option>
							<option value="89">89 - Yonne</option>
							<option value="90">90 - Territoire de Belfort</option>
							<option value="91">91 - Essonne</option>
							<option value="92">92 - Hauts-de-Seine</option>
							<option value="93">93 - Seine-Saint-Denis</option>
							<option value="94">94 - Val-de-Marne</option>
							<option value="95">95 - Val-d'Oise</option>
							<option value="971">971 - Guadeloupe</option>
							<option value="972">972 - Martinique</option>
							<option value="973">973 - Guyane</option>
							<option value="974">974 - Réunion</option>
							<option value="975">975 - Saint-Pierre-et-Miquelon</option>
							<option value="984">984 - Terres-australes-et-antarctiques-françaises
							</option>
							<option value="985">985 - Mayotte</option>
							<option value="986">986 - Wallis-et-Futuna</option>
							<option value="987">987 - Polynesie-franeaise</option>
							<option value="988">988 - Nouvelle-Caledonie</option>
						</select>
					</div>
				</fieldset>

				<fieldset>
					<legend>Informations de connexion</legend>
					<i class="icones material-icons prefix">lock_outline</i>
					<label for="login">Pseudo : </label>
					<input type="text" id="login" name="login" value="" />

					<i class="icones material-icons prefix">lock_outline</i>
					<label for="password">Mot de passe : </label>
					<input type="password" id="password" name="password" value="" />

					<i class="icones material-icons prefix">lock_outline</i>
					<label for="mdpConfirmation">Confirmation : </label>
					<input type="text" id="mdpConfirmation" name="mdpConfirmation" value="" />



					<button id="inscription" class="btn waves-effect waves-light center" type="submit" name="inscription" a>
						s'inscrire
						<i class="material-icons right">send</i>
					</button>

				</fieldset>



			</form>

			<form method="POST" class="col s12 m4 offset-m1" action="Connexion" name="formConnexion">
				<fieldset>
					<legend>Connexion</legend>
					<div class="row">
						<div class="input-field col s12">
							<input placeholder="Placeholder" id="login" name="login" type="text" class="pass">
							<label for="login">Login</label>
						</div>
						<div class="input-field col s12">
							<input id="pass" type="password" name="pass" class="pass">
							<label for="pass">Mot de Passe</label>
						</div>
					</div>
					<div id="lesbouttons" class="row center">

						<div id="connexion" class="bouton">

							<button id="connexion" class="btn waves-effect waves-light" type="submit" name="connexion" a>
								connexion
								<i class="material-icons right">send</i>
							</button>
						</div>
					</div>
				</fieldset>
			</form>
		</div>

		<footer class="page-footer light-blue darken-1">
			<div class="container">
				<div class="row">
					<div class="col l6 s12"></div>
					<div class="col l4 offset-l2 s12">
						<h5 class="white-text">Reseaux Sociaux</h5>
						<ul class="valign" id="menubas">
							<li>
								<a class="grey-text text-lighten-3" href="#!">
									<img src="images/icones/facebook.png" alt="">
								</a>
							</li>
							<li>
								<a class="grey-text text-lighten-3" href="#!">
									<img src="images/icones/twitter.png" alt="">
								</a>
							</li>
							<li>
								<a class="grey-text text-lighten-3" href="#!">
									<img src="images/icones/pinterest.png" alt="">
								</a>
							</li>
							<li>
								<a class="grey-text text-lighten-3" href="#!">
									<img src="images/icones/youtube.png" alt="">
								</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="footer-copyright"></div>
		</footer>
	</div>
</body>

</html>