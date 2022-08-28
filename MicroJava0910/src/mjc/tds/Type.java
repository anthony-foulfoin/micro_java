package mjc.tds;

import java.io.Serializable;

/**
 * Represente un type.
 * 
 * Un type est represente par son nom et sa taille.
 * Dans le cas d'une classe, le nom du type est le nom de la classe.
 * Dans le cas d'une primitive , le nom est soit "int", soit "bool".
 * 
 * @author afoulfoi
 *
 */
public class Type implements Serializable {

	private String nom;
	private int taille;
	
	/** Constructeur
	 * 
	 * @param nom nom du type
	 * @param taille taille du type en octets
	 */
	public Type(String nom, int taille){
		
		if(nom == null) throw new NullPointerException("Un nom doit etre indique");
		//if(taille<0) throw new NullPointerException("La taille doit etre positive");

		this.nom = nom;
		this.taille = taille;
	}

	/** Getter
	 * @return nom
	 */
	public String getNom(){
		return this.nom;
	}
	
	/** Getter
	 * @return taille
	 */
	public int getTaille(){
		return this.taille;
	}
	
	
	public boolean isCompatible(Type t){
		
		boolean compatible = false;
		
		// Les types sont compatibles si le nom du type est identique
		if(nom.equals(t.getNom())) compatible = true;
		// Le type null est compatible avec les pointeurs
		if(nom.equals("null") && t instanceof InfoClasse) compatible = true;
		return compatible;
	}

}
