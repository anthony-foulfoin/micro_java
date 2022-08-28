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
public class S_AFFX_MJAVA {
LEX_MJAVA scanner;
  S_AFFX_MJAVA() {
    }
  S_AFFX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_affectable;
  InfoMethode att_methode_courante;
  InfoClasse att_classe_courante;
  TDS<InfoClasse> att_tdc;
  String att_code;
  TDS<InfoVar> att_tdv;
  Type att_type;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle34() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_ER_MJAVA x_3 = new S_ER_MJAVA(scanner) ;
    //appel
      action_auto_inh_34(x_3);
    x_2.analyser(LEX_MJAVA.token_affect);
    x_3.analyser() ;
      action_type_34(x_3);
      action_code_34(x_3);
  }
  private void regle35() throws Exception {

    //declaration
    //appel
      action_type_35();
      action_code_35();
  }
private void action_code_34(S_ER_MJAVA x_3) throws Exception {
try {
// locales
// instructions
this.att_code=x_3.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_34(S_ER_MJAVA x_3) throws Exception {
try {
// locales
// instructions
this.att_type=x_3.att_type;
this.att_affectable=x_3.att_affectable;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_35() throws Exception {
try {
// locales
// instructions
this.att_type=null;
this.att_affectable=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_35() throws Exception {
try {
// locales
// instructions
this.att_code="";
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_34(S_ER_MJAVA x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_classe_courante=this.att_classe_courante;
x_3.att_methode_courante=this.att_methode_courante;
x_3.att_tdc=this.att_tdc;
x_3.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_affect : // 1353
        regle34 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1351
        regle35 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1350
        regle35 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1345
        regle35 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
