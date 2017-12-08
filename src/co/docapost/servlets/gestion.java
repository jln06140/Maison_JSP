package co.docapost.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.docapost.beans.Admin;

/**
 * Servlet implementation class gestion
 */
@WebServlet("/listeClients")
public class gestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE =  "/WEB-INF/listeClients.jsp";   
	private static final String PARAM_USER =  "user";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean acces = false;
		String user = request.getParameter(PARAM_USER);
		
		if(user.equals("admin")) {
			request.setAttribute("admin",Admin.getInstance());
			acces = true;
		}else {
			acces = false;
		}
		
		request.setAttribute("acces", acces);
		this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
