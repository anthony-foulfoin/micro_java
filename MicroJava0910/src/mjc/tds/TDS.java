package mjc.tds;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Represente une Table Des Symboles de maniere generique.
 * 
 * Elle herite de la classe HashMap<String, T>, T etant un type parametre de la classe TDS.
 * Ce type est celui des valeurs que contiendra la TDS.
 * 
 * Ce type doit implementer obligatoirement implementer l'interface Info :
 * en effet, seules des informations relatives a un ident peuvent
 * etre stockees dans la TDS.
 * 
 * ex = TDS<InfoMethode> table = new TDS<InfoMethode>(null);
 *
 * @param <T extends Info> Le type de valeurs que contiendra la HashMap. 
 * @author afoulfoi
 */
public class TDS<T extends Info> extends LinkedHashMap<String, T>{
	
	// La table parente est une TDS dont le type parametre est compatible avec T.
	private TDS<? extends T> parente;
	
	/** Constructeur de la table.
	 * 
	 * @param parente TDS parente de meme type parametre. Eventuellement null.
	 */
	public TDS(TDS<? extends T> parente){
		this.parente = parente;
	}

	/**
	 * Recherche une valeur possedant la cle indiquee dans la table locale.
	 * 
	 * @param cle La cle recherchee
	 * @return la valeur associee a la cle. Null si aucun resultat.
	 */
	public T chercherLocalement(String cle){
		if(cle == null){
			throw new NullPointerException("Une cle non null doit etre indique");
		}
		
		return this.get(cle);
	}
	
	/**
	 * Recherche une valeur possedant la cle indiquee dans la table locale, 
	 * et dans les tables parentes si aucun resultat.
	 * 
	 * @param cle La cle recherchee
	 * @return la valeur associee a la cle. Null si aucun resultat.
	 */
	public T chercherGlobalement(String cle){
		if(cle == null){
			throw new NullPointerException("Une cle non null doit etre indique");
		}
		
		T info = this.get(cle);
		
		if(info == null && parente!=null) info = parente.chercherGlobalement(cle);
		
		return info;		
	}
	
	public String afficherVariablesAccessibles(){
		String res = this.toString();
		if(parente!=null) res+=parente.afficherVariablesAccessibles();
		return res;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Set<Map.Entry<String, T>> s = entrySet();
		for (Map.Entry<String, T> e : s){
			sb.append("; " + e.getKey() + " : " + e.getValue() + '\n');
		
		}
		return sb.toString();
	}

}
