package mjc.tds;

/**
 * Represente un attribut d'une classe.
 * 
 * C'est un InfoVar avec une protection. 
 * Il sera destine a etre stocke dans la table des attributs
 * de InfoClasse.
 * 
 * @author jdalbert
 *
 */
public class InfoAttribut extends InfoVar implements Info, Protegeable {
	
	private Boolean estPublic;
	private InfoClasse classeContenante;
	
	/** Constructeur
	 * @param type
	 * @param depl
	 * @param p
	 */
	public InfoAttribut(int depl, Boolean protection, Type type, InfoClasse classeContenante, String nom) {
		super(depl, type, nom);
		this.setProtection(protection);
		this.classeContenante = classeContenante;
	}

	@Override
	public Boolean estPublic() {
		return this.estPublic;
	}
	
	@Override
	public void setProtection(Boolean estPublic) {
		this.estPublic = estPublic;
	}
	
	public InfoClasse getClasseContenante(){
		return classeContenante;
	}
}
