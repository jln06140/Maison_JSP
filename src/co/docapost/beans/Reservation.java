package co.docapost.beans;

import java.util.ArrayList;
import java.util.List;

import co.docapost.enums.TypesSejour;
import co.docapost.enums.OptionsSejour;

public class Reservation {
	private Client client;
	private int nombrePersonnes;
	private int nombreNuitees;
	private ArrayList <OptionsSejour> option;
	private TypesSejour typeSejour;
	
	
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
		for(String option : liste) {
			
			if(option != null) {
				OptionsSejour enum1 = OptionsSejour.valueOf(option);
				System.out.println(enum1);
				this.option.add(enum1);
			}
		}
	}
	
	
	public TypesSejour getTypeSejour() {
		return typeSejour;
	}
	
	public void setTypeSejour(String typeSejour) {
		TypesSejour enum1 = TypesSejour.valueOf(typeSejour);
		this.typeSejour = enum1;
	}
		
	

	
	
	
}
