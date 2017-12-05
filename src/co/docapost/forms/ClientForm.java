package co.docapost.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import co.docapost.beans.Client;

public class ClientForm {
	public static final String CHAMP_NOM = "nom";
	public static final String CHAMP_PRENOM = "prenom";
	public static final String CHAMP_EMAIL = "email";
	public static final String CHAMP_TELEPHONE = "telephone";
	public static final String CHAMP_DEPARTEMENT = "departements";
	
	private String resultat;
	private Map<String,String> erreurs = new HashMap<>();
	
	
	
	public String getResultat() {
		return resultat;
	}

	public Map<String, String> getErreurs() {
		return erreurs;
	}
	
	public void SetErreur(String champs, String message) {
		erreurs.put(champs, message);
	}
	
	public Client creationClient(HttpServletRequest request) {
		//System.out.println(request.getAttribute(CHAMP_NOM));
		String nom = getValeurChamp(request, CHAMP_NOM);
		String prenom = getValeurChamp(request, CHAMP_PRENOM);
		String email = getValeurChamp(request, CHAMP_EMAIL);
		String telephone = getValeurChamp(request, CHAMP_TELEPHONE);
		String departement = getValeurChamp(request, CHAMP_DEPARTEMENT);
		
		
		
		Client client = new Client();
		
		
		try {
			validationNom(nom);
		}catch(Exception e) {
			SetErreur(CHAMP_NOM, e.getMessage());
		}
		client.setNom(nom);
		
		
		try {
			validationNom(prenom);
		}catch(Exception e) {
			SetErreur(CHAMP_PRENOM, e.getMessage());
		}
		client.setPrenom(prenom);
		
		
		try {
			validationNom(email);
		}catch(Exception e) {
			SetErreur(CHAMP_EMAIL, e.getMessage());
		}
		client.setEmail(email);
		
		
		try {
			validationNom(telephone);
		}catch(Exception e) {
			SetErreur(CHAMP_TELEPHONE, e.getMessage());
		}
		client.setTelephone(telephone);
		
		try {
			validationNom(departement);
		}catch(Exception e) {
			SetErreur(CHAMP_DEPARTEMENT, e.getMessage());
		}
		client.setDepartement(departement);
		
		return client;
		
		
		
	}
	
	public String getValeurChamp(HttpServletRequest request, String champ) {
		String temp =  request.getParameter(champ);
		//System.out.println(temp);
		if(temp == null || temp.length() == 0) {
			return null;
		}
		else {
			return temp;
		}
	}
	
	public void validationNom(String nom) throws Exception {
		if(nom == null) {
			throw new Exception("Merci de saisir un nom");
		}
	}
	
	public void validationPrenom(String prenom) throws Exception {
		if(prenom == null) {
			throw new Exception("Merci de saisir un prenom");
		}
	}
	
	public void validationEmail(String email) throws Exception {
		if(email == null) {
			throw new Exception("Merci de saisir un email");
		}
		else {
			if(!email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" )){
				throw new Exception("Format email non valide");
			}
		}
	}
	
	public void validationTelephone(String telephone) throws Exception {
		if(telephone != null && !telephone.matches( "^\\d+$" )) {
			throw new Exception("Format telephone non valide");
		}
		else {
			throw new Exception("Merci de saisir un numero de telephone");
		}
	}
	
	public void validationDepartement(String departement) throws Exception {
		if(departement == null) {
			throw new Exception ("Merci de choisir un departement");
		}
	}
	
}
