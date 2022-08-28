package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mjc.tds.*;
import mjc.type.*;
import java.util.Iterator;
import java.io.File;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_IMPORT_MJAVA {
LEX_MJAVA scanner;
  S_IMPORT_MJAVA() {
    }
  S_IMPORT_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  MJAVASourceFile att_source;
  TDS<InfoClasse> att_tdc;
  LEX_MJAVA att_scanner;
  private void regle3() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_import);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_pv);
      action_importer_classe_3(x_3);
  }
private void action_importer_classe_3(T_MJAVA x_3) throws Exception {
try {
// locales
File loc_fichierClasseCourante;
String loc_dossierCourant;
MJC loc_mjc;
// instructions
loc_fichierClasseCourante= new File(this.att_source.getFileName());
loc_dossierCourant=loc_fichierClasseCourante.getParent();
loc_mjc= new MJC();
if ((this.att_tdc.chercherLocalement(x_3.att_txt)==null)){
    loc_mjc.mainUniqueArgument(loc_dossierCourant+"/"+x_3.att_txt+".mj");
}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    regle3 () ;
  }
  }
