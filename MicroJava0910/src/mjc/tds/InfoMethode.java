package mjc.tds;

import java.io.Serializable;
import java.util.Iterator;

/**
 * Represente une methode d'une classe.
 * 
 * Son type est le type de retour.
 * Elle possede une protection.
 *  
 * Elle sera destinee a etre stockee dans la table des methodes
 * de InfoClasse.
 * 
 * @author jdalbert
 *
 */
public class InfoMethode implements Info, Protegeable, Serializable {

	private Boolean estPublic;
	private TDS<InfoVar> tableParametres;
	private int deplacement;
	private Type typeRetour;
	private String nom;
	private InfoClasse classeContenante;
	
	/** Constructeur
	 * @param deplacement
	 * @param protection
	 * @param typeRetour le type de retour de la methode 
	 * 			(null si void)
	 * @param classeContenante la classe qui contient la methode
	 */
	public InfoMethode(String nom, int deplacement, Boolean protection, Type typeRetour, InfoClasse classeContenante) {
		this.typeRetour = typeRetour == null ? new Type("null", 0) : typeRetour;
		this.setDeplacement(deplacement);
		this.setProtection(protection);
		this.nom = nom;
		this.classeContenante = classeContenante;
		this.setTableParametres(new TDS<InfoVar>(classeContenante.getTableAttributs()));
	}
	
	public void majDeplParams() {
		/* Le premier parametre est empile en premier dans notre code. 
		 * Son deplacement par rapport a LB est donc le plus bas possible.
		 * 
		 * Exemple :
		 * Soit la methode public void m(a,b) { ... }
		 * Alors l'adresse de a est -2[LB] et celle de b est -1[LB].
		 */
		int depl = -this.getTableParametres().size();
		
		for (Iterator<InfoVar> i = this.getTableParametres().values().iterator();i.hasNext();) {
			i.next().setDeplacement(depl);
			
			depl++;
		}
	}

	/** Getter
	 * @return deplacement
	 */
	public int getDeplacement() {
		return deplacement;
	}
	
	/** Setter
	 * @param deplacement
	 */
	public void setDeplacement(int deplacement) {
		this.deplacement = deplacement;
	}
	
	public Type getTypeRetour(){
		return this.typeRetour;
	}
	
	public Iterator<InfoVar> getIteratorParamsEtVars(){
		return getTableParametres().values().iterator();
	}

	@Override
	public Boolean estPublic() {
		return estPublic;
	}

	@Override
	public void setProtection(Boolean estPublic) {
		this.estPublic = estPublic;
	}

	/** Setter
	 * @param tableParametres
	 */
	public void setTableParametres(TDS<InfoVar> tableParametres) {
		this.tableParametres = tableParametres;
	}

	/** Getter
	 * @return the tableParametres
	 */
	public TDS<InfoVar> getTableParametres() {
		return tableParametres;
	}
	
	public String getNom(){
		return nom;
	}
	
	public InfoClasse getClasseContenante(){
		return this.classeContenante;
	}
		
}
