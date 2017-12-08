<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav>
	<div class="nav-wrapper light-blue darken-1">
		<a href="http://www.vence.fr/" class="brand-logo"> <img
			src="images/logo2.jpg" id="logo" />
		</a> <a href="#" data-activates="mobile-demo" class="button-collapse">
			<i class="material-icons">menu</i>
		</a>
		<ul class="right hide-on-med-and-down">
			<li><a href="accueil">Ma Maison</a></li>
			<li><a href="region">Ma Region</a></li>
			<li><a href="inscription">Inscription</a></li>
			<li><a
				href="<c:url value="listeClients">
					<c:param  name="user" value="admin"/>
					</c:url>">Gestion</a></li>
		</ul>
		<ul class="side-nav" id="mobile-demo">
			<li><a href="accueil">Ma Maison</a></li>
			<li><a href="region">Ma Region</a></li>
			<li><a href="inscription">Inscription</a></li>
			<li><a
				href="<c:url value="listeClients">
							<c:param  name="user" value="admin"/>
						</c:url>">Gestion</a></li>
		</ul>
	</div>
</nav>