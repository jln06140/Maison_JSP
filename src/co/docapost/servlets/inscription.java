package co.docapost.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.docapost.beans.Admin;
import co.docapost.beans.Reservation;
import co.docapost.forms.InscriptionForm;

/**
 * Servlet implementation class inscription
 */
@WebServlet("/inscription")
public class inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String VUE_ERREUR =  "/WEB-INF/inscription.jsp";
	private static final String VUE_SUCCESS =  "/WEB-INF/InscriptionValidee.jsp";
	private static final String ATT_CLIENT = "client";
	private static final String ATT_RESERVATION = "reservation";
	private static final String ATT_ADMIN = "admin";
	
	
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		this.getServletContext().getRequestDispatcher( VUE_ERREUR ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InscriptionForm form = new InscriptionForm();
		Reservation reservation = form.creerReservation(request);
		
		
		request.setAttribute(ATT_RESERVATION, reservation);
		request.setAttribute(ATT_ADMIN, Admin.getInstance());
		
		if (form.getErreurs().isEmpty()) {
			this.getServletContext().getRequestDispatcher( VUE_SUCCESS ).forward( request, response );
		}
		else {
			this.getServletContext().getRequestDispatcher( VUE_ERREUR ).forward( request, response );
		}
		
		
	}

}
