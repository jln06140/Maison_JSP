package co.docapost.enums;

public enum OptionsSejour {
	Animal ("Animal"),
	Fumeur ("Fumeur"),
	Parking ("Parking");
	
	private String name = "";
	
	OptionsSejour(String name) {
		this.name = name;
	}
	
	public String toString(){
	    return name;
	  }
}
