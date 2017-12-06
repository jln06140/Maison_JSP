package co.docapost.beans;

import java.util.ArrayList;


public class Admin {
	private final static Admin INSTANCE = new Admin();
	private ArrayList<Reservation> listeReservations = new ArrayList<>();
	
	
	private Admin() {
		
	}
	
	public static Admin getInstance() {
		return INSTANCE;
	}
	
	public void ajoutReservation(Reservation reservation) {
		this.listeReservations.add(reservation);
	}

	public ArrayList<Reservation> getListeReservations() {
		return listeReservations;
	}
	
//	public void afficherListeReservations() {
//		for(Reservation r : this.listeReservations) {
//			System.out.println(r.getClient().getNom());
//			System.out.println(r.getClient().getPrenom());
//			System.out.println(r.getClient().getEmail());
//			System.out.println(r.getNombreNuitees());
//		}
//	}
//	
	
}
