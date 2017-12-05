package co.docapost.enums;

public enum TypesSejour {
	prive ("Loisir"),
	professionnel ("Professionnel");

	private String name = "";
	
	TypesSejour(String name){
		this.name= name;
	}
	
	public String toString(){
	    return name;
	  }

public static String getOptionSejour(String chaine) {
	if(chaine.equals("prive")) return "privé";
	else return "professionnel";
}
}
