package mjc.gc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Iterator;

import mjc.compiler.MJCException;
import mjc.tds.InfoAttribut;
import mjc.tds.InfoClasse;
import mjc.tds.InfoMethode;
import mjc.tds.InfoVar;
import mjc.tds.TDS;
import mjc.tds.Type;

public abstract class AbstractMachine {
	protected abstract String getSuffixe();

	public void writeCode(String fname, String code) throws MJCException {
		try {
			String asmName = fname + "." + getSuffixe();
			System.err.println("Ecriture du code dans " + asmName);
			PrintWriter pw = new PrintWriter(new FileOutputStream(asmName));
			pw.print(code);
			pw.close();
		} catch (FileNotFoundException e) {
			throw new MJCException(e.getMessage());
		}
	}
	
	public abstract String genChargValeurVar(int taille);
	
	public abstract String genNullPointeur();
	
	public abstract String genCodeClasses(TDS<InfoClasse> c);
	
	public abstract  String genBloc(String code, int taille);
	
	public abstract String genTableVirtuelles (TDS<InfoClasse> c);
	
	public abstract String genDecl(Type t, String nomVar, String ini);
	
	public abstract String genIf(String code, String code2, String code3);
	
	public abstract String genWhile(String cond, String bloc);
	
	public abstract String genAffectation(String gauche, String droite);

	public abstract String genRetour(InfoMethode m);
	
	public abstract String genInf();
	
	public abstract String genInfEg();
	
	public abstract String genSup();
	
	public abstract String genSupEg();
	
	public abstract String genEq();
	
	public abstract String genNeq();
	
	public abstract String genPlus();
	
	public abstract String genMoins();
	
	public abstract String genOu();
	
	public abstract String genMult();

	public abstract String genDiv();
	
	public abstract String genMod();
	
	public abstract String genEt();
	
	public abstract String genEntier(String e);
	
	public abstract String genBool(boolean b);
	
	public abstract String genNeg();
	
	public abstract String genNon();
	
	public abstract String genAppelVariable(InfoVar variable, boolean locale, InfoMethode contenante);
	
	public abstract String genCodeMethode(InfoMethode m, String codem, InfoClasse c);
	
	public abstract String genAppelMethode(InfoMethode m, String args, boolean locale, InfoMethode contenante);
	
	public abstract String genCodeConstructeur(InfoMethode m, String codem, InfoClasse c);
	
	public abstract String genAppelConstructeur(String nomType, String params);

}
