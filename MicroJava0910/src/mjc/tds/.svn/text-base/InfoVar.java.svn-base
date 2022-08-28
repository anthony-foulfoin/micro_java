package mjc.tds;


/**
 * Une InfoVar represente une variable en general.
 * On stockera notamment des InfoVar dans la table des
 * variables d'une methode.
 * 
 * @author jdalbert
 *
 */
public class InfoVar implements Info {

	protected int deplacement;
	private Type type;
	private String nom;
	
	/** Constructeur
	 * @param type
	 * @param deplacement
	 */
	public InfoVar(int deplacement, Type type, String nom) {
		this.type = type;
		this.deplacement = deplacement;
		this.nom = nom;
	}

	/** Setter
	 * @param deplacement
	 */
	public void setDeplacement(int deplacement) {
		this.deplacement = deplacement;
	}

	/** Getter
	 * @return deplacement
	 */
	public int getDeplacement() {
		return deplacement;
	}
	
	public Type getType(){
		return this.type;
	}
	
	public String getNom(){
		return nom;
	}
	
}
