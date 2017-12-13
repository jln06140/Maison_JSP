package co.docapost.beans;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import co.docapost.enums.TypesSejour;
import co.docapost.enums.OptionsSejour;

public class Reservation {
	
	private Long idReservation;
	private Client client;
	private int nombrePersonnes;
	private int nombreNuitees;
	private ArrayList<OptionsSejour> option;
	private String typeSejour;
	
	private Timestamp dateDebut;
	private Timestamp dateFin;
	
//	public enum optionSejour{Animal,Fumeur,Parking};
//	public enum typeSejour{Loisirs,Professionnel};
	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public void setNombrePersonnes(int nombrePersonnes) {
		this.nombrePersonnes = nombrePersonnes;
	}

	public int getNombreNuitees() {
		return nombreNuitees;
	}

	public void setNombreNuitees(int nombreNuitees) {
		this.nombreNuitees = nombreNuitees;
	}

	public ArrayList<OptionsSejour> getOption() {
		return option;
	}

	public void setOption(List<String> liste) {
		for (String option : liste) {

			if (option != null) {
				OptionsSejour enum1 = OptionsSejour.valueOf(option);
				//System.out.println(enum1.name());
				this.option.add(enum1);
			}
		}
	}

	public String getTypeSejour() {
		return typeSejour;
	}

	public void setTypeSejour(String typeSejour) {
		this.typeSejour = typeSejour;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Timestamp getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Timestamp dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Timestamp getDateFin() {
		return dateFin;
	}

	public void setDateFin(Timestamp dateFin) {
		this.dateFin = dateFin;
	}
	
	

	

}
