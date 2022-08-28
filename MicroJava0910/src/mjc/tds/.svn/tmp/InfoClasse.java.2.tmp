package mjc.tds;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Stack;

/**
 * Represente une classe Mini-Java.
 * 
 * Elle est caracterisee par 
 * une classe mere (eventuellement nulle),
 * un deplacement (utilise pour generer le code), 
 * un constructeur,
 * un nom,
 * une table des attributs et une table des methodes.
 *
 * @author afoulfoi, jdalbert
 *
 */
public class InfoClasse extends Type implements Info, Serializable {

	private InfoClasse mere;
	private InfoMethode constructeur;
	
	private TDS<InfoAttribut> tableAttributs;
	private TDS<InfoMethode> tableMethodes;
	
	private int deplTV;
	
	private InfoAttribut dernierAttribut;
	private InfoMethode derniereMethPublique;
	
	private String code;
		
	/** Constructeur
	 * 
	 * @param mere 
	 * 				Classe mere de la classe courante. 
	 * 				Il s'agit d'une relation d'hritage symbolisee grace 
	 * 				au symbole extends.
	 * 				Eventuellement null.
	 * @param deplacement
	 * 				Numero de mot memoire auquel commencent les attributs 
	 * 				de la classe dans la pile.
	 * @param nom
	 * 				Nom de la classe
	 */
	public InfoClasse(InfoClasse mere, int deplTV, String nom) {

		// TODO : voir si taille utile
		// On appelle le constructeur de Type avec une taille -1 indiquant qu'il s'agit d'une classe dont la taille doit etre
		// calculee dynamiquement
		super(nom,-1);
			
		if(nom==null) throw new NullPointerException("Le nom de la classe doit est specifie");
		
		this.setDeplTV(deplTV);
		this.mere = mere;
		this.constructeur = null;
		
		TDS<InfoAttribut> tAttributsMere = null;
		TDS<InfoMethode> tMethodesMere = null;
		
		if(mere != null) {
			tAttributsMere = mere.getTableAttributs();
			tMethodesMere = mere.getTableMethodes();
		}
		
		this.tableAttributs = new TDS<InfoAttribut>(tAttributsMere);
		this.tableMethodes = new TDS<InfoMethode>(tMethodesMere);
	}
	
	/**
	 * Verifie que deux types sont compatibles entre eux.
	 * Deux types sont compatibles s'ils sont egaux, ou si le type passe en parametre est un sous-type du type
	 * considere.
	 * 
	 * @param t
	 * @return
	 */
	public boolean isCompatible(Type t){
		
		boolean compatible = false;
		
		if(t instanceof InfoClasse){
		
			// Les types sont compatibles si le nom du type est identique
			if(this.getNom().equals(t.getNom())) compatible = true;
			// Sinon, on verifie si le type à droite de l'expression est sous type de celui de gauche
			else if(((InfoClasse)t).isChildOf(this)) compatible = true;
			

		}
		// Sinon on verifie de le site de droite est null
		// On peut par exemple fait Point p = null. 
		// null est represente par un type new Type("null",0);
		else if(t.getNom().equals("null")) compatible = true;
		
		return compatible;
	}
	
	public boolean isChildOf(InfoClasse cmere){
		
		boolean isChild = false;
		
		// Si la classe possede une classe mere
		if(cmere!=null){
			// On verifie s'il s'agit de la classe recherchee
			if(cmere.getNom().equals(this.getNom())){
				isChild = true;
			}
			// Sinon on verifie s'il s'agit d'une parente de la classe mere
			if(mere!=null) isChild = mere.isChildOf(cmere);
		}
		
		return isChild;
	}	
	
	/**
	 * Calcule la taille des elements de la TDA, et donc de la classe
	 * 
	 * 
	 * @return taille des elements de la TDA
	 */
	public int getTaille(){
		int taille = 0;
		
		// On calcule recursivement la taille des parents
		if (mere != null) taille += mere.getTaille();
		
		// Puis on ajoute la taille de nos attributs 
		for (Iterator<InfoAttribut> iterator = tableAttributs.values().iterator(); iterator.hasNext();) {
			InfoAttribut a = iterator.next();
			// S'il s'agit d'un pointeur sur une classe, la taille est de 1
			if (a.getType() instanceof InfoClasse) taille+=1;
			else taille += a.getType().getTaille();	
		}
		
		return taille;
	}
	
	public int getTailleTV(){	
		int taille = 0;
		// Contiendra toutes les methodes accessibles par la classe (peut contenir des methodes des super classes)
		// Le premier but est de remplir cette map
		LinkedHashMap<String, InfoMethode> methodes = new LinkedHashMap<String, InfoMethode>();
		
		// La pile contient toutes les classes a traiter
		// les classes sont enregistrees selon leur hierarchie
		// On traite le probleme du haut vers le bas.
		Stack<InfoClasse> pile = new Stack<InfoClasse>();
		pile.push(this);
		// On rempli la pile
		while(pile.peek().getParente()!= null) pile.push(pile.peek().getParente());
		
		// On traite la pile tant qu'elle n'est pas vide
		while(!pile.empty()){
			// on doit parcourir toutes les methodes de la classe en haut de la pile
			for (Iterator<InfoMethode> iterator = pile.peek().getTableMethodes().values().iterator(); iterator.hasNext();) {
				InfoMethode m = iterator.next();
				
				// On traite la methode si elle est publique
				if(m.estPublic()){
					// On regarde si la methode a deja ete traitee
					if(methodes.get(m.getNom())==null){
						// Si la methode n'a pas deja ete traite, on s'en occupe
						// On effectue une recherche globale depuis la racine pour obtenir la methode de plus bas niveau
						m = this.getTableMethodes().chercherGlobalement(m.getNom());
						// On enregistre cette methode dans la map
						methodes.put(m.getNom(), m);
					}
				}
			}
			pile.pop();
		}
		
		// Une fois que la map des methodes est complete, il suffit de la parcourir pour construire le code 
		// de la table des virtuelles
		
		for (Iterator<InfoMethode> iterator = methodes.values().iterator(); iterator.hasNext();) {
			InfoMethode m = iterator.next();
			taille += 1;
		}
		// On place les methodes privees apres les methodes publiques
		return taille;
	}
	
	/** Getter
	 * @return constructeur
	 */
	public InfoMethode getConstructeur(){
		return constructeur;
	}
	
	/** Setter
	 * @param constructeur, null si constructeur vide. 
	 */
	public void setConstructeur(InfoMethode constructeur){
		this.constructeur = constructeur;
	}
	
	/** Getter
	 * @return classe mere
	 */
	public InfoClasse getParente(){
		return this.mere;
	}
	
	/** Getter
	 * @return tableAttributs
	 */
	public TDS<InfoAttribut> getTableAttributs() {
		return tableAttributs;
	}
	
	/** Getter
	 * @return tableMethodes
	 */
	public TDS<InfoMethode> getTableMethodes() {
		return tableMethodes;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param deplTV the deplTV to set
	 */
	public void setDeplTV(int deplTV) {
		this.deplTV = deplTV;
	}

	/**
	 * @return the deplTV
	 */
	public int getDeplTV() {
		return deplTV;
	}

	/**
	 * @param dernierAttribut the dernierAttribut to set
	 */
	public void setDernierAttribut(InfoAttribut dernierAttribut) {
		this.dernierAttribut = dernierAttribut;
	}

	/**
	 * @return the dernierAttribut
	 */
	public InfoAttribut getDernierAttribut() {
		return dernierAttribut;
	}

	/**
	 * @param derniereMethPublique the derniereMethPublique to set
	 */
	public void setDerniereMethPublique(InfoMethode derniereMethPublique) {
		this.derniereMethPublique = derniereMethPublique;
	}

	/**
	 * @return the derniereMethPublique
	 */
	public InfoMethode getDerniereMethPublique() {
		return derniereMethPublique;
	}
}
