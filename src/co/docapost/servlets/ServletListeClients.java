package co.docapost.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.docapost.beans.Admin;

/**
 * Servlet implementation class gestion
 */
@WebServlet("/listeClients")
public class ServletListeClients extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE = "/WEB-INF/listeClients.jsp";
	private static final String ATT_USER = "user";
	private static final String ATT_ACCES = "acces";
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletListeClients() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//recuperation session
		HttpSession session = request.getSession();
		String deconnexion = request.getParameter("deco");
		
		if(deconnexion != null && deconnexion.equals("true")) {
			session.invalidate();
		}
		
		boolean acces = false;
		
		
		//recuperation attribut user de la session
		String user = (String) session.getAttribute("user"); 
		System.out.println(user);
		
		
		//si user existe et = a admin
		if(user != null) {
			if(user.equals("admin")) {
				acces =true;
				
				// creation de deux attributs de l'instance admin et d'un acces permettant afficher donnees dans jsp
				request.setAttribute(ATT_ACCES, acces);
				request.setAttribute("admin", Admin.getInstance());
				this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
			}
		}else {
			
			//si user inexistant alors redirection vers page connexion
			acces = false;
			response.sendRedirect("Connexion");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
