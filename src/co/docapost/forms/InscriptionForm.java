package co.docapost.forms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import co.docapost.beans.Client;
import co.docapost.beans.Reservation;
import co.docapost.enums.TypesSejour;

public class InscriptionForm {

	//public static final List<String> CHAMP_TYPES = new ArrayList<>();
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

	public Reservation creerReservation(HttpServletRequest request) {

		ClientForm clientForm = new ClientForm();
		Client client = clientForm.creationClient(request);

		erreurs = clientForm.getErreurs();
		
		Reservation reservation = new Reservation();

		if (erreurs.isEmpty()) {
			String type = recuperationType(request);
			List<String> option = recuperationOption(request, CHAMP_OPTIONS);
			
			String nuitees = getValeurChamp(request, CHAMP_NUITEES);
			String nbPersonnes = getValeurChamp(request, CHAMP_NB_PERSONNES);

			
			reservation.setClient(client);
			
			reservation.setNombreNuitees(Integer.parseInt(nuitees));
			reservation.setNombrePersonnes(Integer.parseInt(nbPersonnes));
			reservation.setOption(option);
			reservation.setTypeSejour(type);
			
			

//			reservation.setNombreNuitees(nombreNuitees);
//			reservation.setNombrePersonnes(nombrePersonnes);
//			reservation.setOption(liste);

		}
		
		return reservation;

	}

	public String getValeurChamp(HttpServletRequest request, String champ) {
		String temp = (String) request.getParameter(champ);
		if (temp == null || temp.isEmpty()) {
			return null;
		} else {
			return temp.trim();
		}
	}

	public List<String> recuperationOption(HttpServletRequest request, ArrayList<String> Otpion) {
		List<String> listeOptions = new ArrayList<>();
		
		if (!Otpion.isEmpty()) {
			for (String choixOption : Otpion) {
				if (request.getParameter(choixOption) != null) {
				    
					listeOptions.add(request.getParameter(choixOption));
				}
			}
		}
		return listeOptions;

	}
	
	public String recuperationType(HttpServletRequest request) {
		String retour="";
		if(request.getParameter("loisir") != null) {
			retour = "Loisir";
		}
		else {
			retour="Professionnel";
		}
		return retour;
	}

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
