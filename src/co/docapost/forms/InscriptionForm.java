package co.docapost.forms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import co.docapost.beans.Admin;
import co.docapost.beans.Client;
import co.docapost.beans.Reservation;
import co.docapost.enums.TypesSejour;

public class InscriptionForm {

	public static final String CHAMP_TYPES = "Typesejour";
	public static final ArrayList<String> CHAMP_OPTIONS = new ArrayList<>();
	public static final String CHAMP_NB_PERSONNES = "nombredepersonnes";
	public static final String CHAMP_NUITEES = "nuitees";

	public InscriptionForm() {
		initialiserListe();
	}

	private String resultat;
	private Map<String, String> erreurs = new HashMap<>();

	public String getResultat() {
		return resultat;
	}

	public Map<String, String> getErreurs() {
		return erreurs;
	}

	public void SetErreur(String champs, String message) {
		erreurs.put(champs, message);
	}

	/*
	 * Creation D'une reservation et recuperation des parametres du formulaire
	 */

	public Reservation creerReservation(HttpServletRequest request) {

		ClientForm clientForm = new ClientForm();
		Client client = clientForm.creationClient(request);

		// Recupaeration des erreurs lors creation du client

		erreurs = clientForm.getErreurs();

		Reservation reservation = new Reservation();

		if (erreurs.isEmpty()) {

			
			List<String> option = recuperationOption(request, CHAMP_OPTIONS);
			String typeDeSejour = getValeurChamp(request, CHAMP_TYPES);
			String nuitees = getValeurChamp(request, CHAMP_NUITEES);
			String nbPersonnes = getValeurChamp(request, CHAMP_NB_PERSONNES);

			reservation.setClient(client);

			try {
				validationNuitees(nuitees);
			}catch (Exception e) {
				erreurs.put(CHAMP_NUITEES, e.getMessage());
			}
			reservation.setNombreNuitees(Integer.parseInt(nuitees));
			
			try {
				validationPersonnes(nbPersonnes);
			}catch (Exception e) {
				erreurs.put(CHAMP_NB_PERSONNES, e.getMessage());
			}
			reservation.setNombrePersonnes(Integer.parseInt(nbPersonnes));
			
			try {
				validationTypeDeSejour(typeDeSejour);
			}catch (Exception e) {
				erreurs.put(CHAMP_TYPES, e.getMessage());
			}
			reservation.setTypeSejour(typeDeSejour);
			
			reservation.setOption(option);
			
			
			
			if(erreurs.isEmpty()) {
				Admin.getInstance().ajoutReservation(reservation);
			}

		}

		return reservation;

	}
	
	public void validationPersonnes(String nbPersonnes) throws Exception {
		if (nbPersonnes == null || nbPersonnes.length() == 0) {
			throw new Exception("Merci de renseigner le nombre de personnes");
		}
	}
	
	public void validationNuitees(String nbNuitees) throws Exception {
		if (nbNuitees == null || nbNuitees.length() == 0) {
			throw new Exception("Merci de renseigner le nombre de Nuitées");
		}
	}
	
	public void validationTypeDeSejour(String typeDeSejour) throws Exception {
		if (typeDeSejour == null || typeDeSejour.length() == 0) {
			throw new Exception("Merci de renseigner le type de sejour");
		}
	}
	
	

	public String getValeurChamp(HttpServletRequest request, String champ) {
		String temp = (String) request.getParameter(champ);
		if (temp == null || temp.isEmpty()) {
			return null;
		} else {
			return temp.trim();
		}
	}

	public List<String> recuperationOption(HttpServletRequest request, ArrayList<String> Option) {
		List<String> listeOptions = new ArrayList<>();
		for (String choixOption : Option) {
			System.out.println(choixOption);
//			if (request.getParameter(choixOption).equals(choixOption)) {
//				System.out.println(choixOption);
//				listeOptions.add(choixOption);
//			}
		}

		return listeOptions;

	}

//	public String recuperationType(HttpServletRequest request) {
//		String retour = "";
//		if (request.getParameter("Loisir") == "Loisir" && request.getParameter("Loisir") != null) {
//			retour = "Loisir";
//		} else if (request.getParameter("Professionnel") == "loisir" && request.getParameter("Professionnel") != null) {
//			retour = "Professionnel";
//		}
//		return retour;
//	}

	public void validationNom(String nom) throws Exception {
		if (nom == null) {
			throw new Exception("Merci de saisir un nom");
		}
	}

	private void initialiserListe() {
		CHAMP_OPTIONS.add("Parking");
		CHAMP_OPTIONS.add("Animal");
		CHAMP_OPTIONS.add("Fumeur");
	}

}
