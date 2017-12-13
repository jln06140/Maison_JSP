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
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/Connexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private static final String VUE_CONNECT = "/WEB-INF/listeClients.jsp";
	private static final String VUE_NON_CONNECT = "/WEB-INF/connexion.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConnexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//verification si admin connecté lors du chargement de la page
		
		HttpSession session = request.getSession();
		String user = (String) session.getAttribute("user");
		
		if(user != null && user.equals("admin")) {
			response.sendRedirect("listeClients");
		}else {
			this.getServletContext().getRequestDispatcher(VUE_NON_CONNECT).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String messageErreur;
		
		HttpSession session = request.getSession();
		String user = request.getParameter("login");
		String mdp = request.getParameter("pass");
		
		
		//si user existant et = a admin
		if (user != null && mdp != null) {
			if (user.equals("admin") && mdp.equals("admin")) {
				request.setAttribute("admin", Admin.getInstance());
				session.setAttribute("user", "admin");
				
				//acces autorisé vers la liste des clients
				response.sendRedirect("listeClients");
			} 
			else {
				
				//acces refusé et redirection vers page connexion avec message erreur
				messageErreur = "Connexion Echouée";
				request.setAttribute("message", messageErreur);
				this.getServletContext().getRequestDispatcher(VUE_NON_CONNECT).forward(request, response);
			}
		}
	}

}
