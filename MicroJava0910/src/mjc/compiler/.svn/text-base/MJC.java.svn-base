package mjc.compiler;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

import mg.egg.eggc.compiler.libjava.ISourceUnit;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import mg.egg.eggc.compiler.libjava.problem.ProblemReporter;
import mg.egg.eggc.compiler.libjava.problem.ProblemRequestor;
import mjc.egg.MJAVA;
import mjc.tds.InfoClasse;
import mjc.tds.TDS;

public class MJC implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private static String fichierTAMResultat = "";
	private static int deplTVClasse = 0;
	
	
	/**
	 * La table des classes statique du programme. 
	 */
	private static TDS<InfoClasse> tdc = new TDS<InfoClasse>(null);

	public static void main(String[] args) {
		if (getFichierTAMResultat().equals(""))
			System.err.print(
					"*************************\n" +
					"*  Micro-Java Compiler  *\n" +
					"*      version 1.0      *\n" +
					"*************************\n");
		
		try {
			ISourceUnit cu = new MJAVASourceFile(args[0]);
			ProblemReporter prp = new ProblemReporter(cu);
			ProblemRequestor prq = new ProblemRequestor();
			((MJAVASourceFile) cu).analyze(args);
			System.err.println("Compiling " + cu.getFileName());
			
			if (getFichierTAMResultat().equals(""))
				fichierTAMResultat =cu.getFileName();
			
			MJAVA compilo = new MJAVA(prp);
			prq.beginReporting();
			compilo.set_source((MJAVASourceFile) cu);
			compilo.compile(cu);
			for (IProblem problem : prp.getAllProblems())
				prq.acceptProblem(problem);
			prq.endReporting();
			
			File f = new File(cu.getFileName());
			System.err.print(f.getName() + " : ");
			System.err.println(Messages.getString("MJC.ok"));
			
			/* On commente la ligne ci-dessous car on peut appeller main plusieurs fois,
			 * et on ne veut pas s'arreter apres le premier appel. */
			// System.exit(0);
		}
		catch (MJCException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/** Equivalent a la methode main, mais avec un seul argument.
	 * 
	 * @param cheminFichier
	 */
	public static void mainUniqueArgument(String argument) {
		String[] args = new String[1];
		args[0] = argument;
		
		main(args);
	}

	/**
	 * @param deplTVClasse the deplTVClasse to set
	 */
	public static void setDeplTVClasse(int deplTVClasse) {
		MJC.deplTVClasse = deplTVClasse;
	}

	/**
	 * @return the deplTVClasse
	 */
	public static int getDeplTVClasse() {
		return deplTVClasse;
	}
	

	/**
	 * @return the fichierTAMResultat
	 */
	public static String getFichierTAMResultat() {
		return fichierTAMResultat;
	}

	/**
	 * @return the tdc
	 */
	public static TDS<InfoClasse> getTdc() {
		return tdc;
	}
}
