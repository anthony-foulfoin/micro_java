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
public class S_PROGRAMME_MJAVA {
LEX_MJAVA scanner;
  S_PROGRAMME_MJAVA() {
    }
  S_PROGRAMME_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  MJAVASourceFile att_source;
  LEX_MJAVA att_scanner;
  AbstractMachine glob_0_machine;
  TDS<InfoClasse> glob_0_tdc;
  private void regle0() throws Exception {

    //declaration
    S_IMPORTS_MJAVA x_4 = new S_IMPORTS_MJAVA(scanner) ;
    S_DEFCLASSE_MJAVA x_5 = new S_DEFCLASSE_MJAVA(scanner) ;
    //appel
      action_auto_inh_0(x_4, x_5);
      action_init_0(x_4, x_5);
      action_tdc_0(x_4, x_5);
    x_4.analyser() ;
    x_5.analyser() ;
      action_gen_0(x_4, x_5);
  }
private void action_gen_0(S_IMPORTS_MJAVA x_4, S_DEFCLASSE_MJAVA x_5) throws Exception {
try {
// locales
String loc_nomFicSource;
MJC loc_mjc;
// instructions
loc_mjc= new MJC();
loc_nomFicSource=this.att_source.getFileName();
if (loc_nomFicSource.equals(loc_mjc.getFichierTAMResultat())){
    glob_0_machine.writeCode(loc_nomFicSource, x_5.att_code);
}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tdc_0(S_IMPORTS_MJAVA x_4, S_DEFCLASSE_MJAVA x_5) throws Exception {
try {
// locales
MJC loc_mjc;
// instructions
loc_mjc= new MJC();
glob_0_tdc=loc_mjc.getTdc();
x_4.att_tdc=glob_0_tdc;
x_5.att_tdc=glob_0_tdc;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_init_0(S_IMPORTS_MJAVA x_4, S_DEFCLASSE_MJAVA x_5) throws Exception {
try {
// locales
// instructions
glob_0_machine=this.att_source.getMachine();
x_5.att_machine=glob_0_machine;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_0(S_IMPORTS_MJAVA x_4, S_DEFCLASSE_MJAVA x_5) throws Exception {
try {
// instructions
x_4.att_source=this.att_source;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_import : // 1343
        regle0 () ;
      break ;
      case LEX_MJAVA.token_classe : // 1360
        regle0 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
