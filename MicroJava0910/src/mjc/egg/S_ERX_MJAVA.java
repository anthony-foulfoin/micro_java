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
public class S_ERX_MJAVA {
LEX_MJAVA scanner;
  S_ERX_MJAVA() {
    }
  S_ERX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_op;
  InfoMethode att_methode_courante;
  InfoClasse att_classe_courante;
  TDS<InfoClasse> att_tdc;
  String att_code;
  TDS<InfoVar> att_tdv;
  Type att_type;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle38() throws Exception {

    //declaration
    S_OPREL_MJAVA x_2 = new S_OPREL_MJAVA(scanner) ;
    S_ES_MJAVA x_3 = new S_ES_MJAVA(scanner) ;
    //appel
      action_auto_inh_38(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
      action_type_38(x_2, x_3);
      action_code_38(x_2, x_3);
  }
  private void regle39() throws Exception {

    //declaration
    //appel
      action_type_39();
      action_code_39();
  }
private void action_code_38(S_OPREL_MJAVA x_2, S_ES_MJAVA x_3) throws Exception {
try {
// locales
String loc_valeur;
// instructions
loc_valeur=x_3.att_code;
if (x_3.att_affectable){
loc_valeur=x_3.att_code+this.att_machine.genChargValeurVar(1);
}

this.att_code=loc_valeur+x_2.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_38(S_OPREL_MJAVA x_2, S_ES_MJAVA x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_3.att_classe_courante=this.att_classe_courante;
x_3.att_methode_courante=this.att_methode_courante;
x_3.att_tdc=this.att_tdc;
x_3.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_38(S_OPREL_MJAVA x_2, S_ES_MJAVA x_3) throws Exception {
try {
// locales
// instructions
this.att_type=x_3.att_type;
this.att_op=x_2.att_op;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_39() throws Exception {
try {
// locales
// instructions
this.att_type=null;
this.att_op="";
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_39() throws Exception {
try {
// locales
// instructions
this.att_code="";
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_inf : // 1367
        regle38 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 1368
        regle38 () ;
      break ;
      case LEX_MJAVA.token_sup : // 1369
        regle38 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 1370
        regle38 () ;
      break ;
      case LEX_MJAVA.token_eg : // 1371
        regle38 () ;
      break ;
      case LEX_MJAVA.token_neg : // 1372
        regle38 () ;
      break ;
      case LEX_MJAVA.token_affect : // 1353
        regle39 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1350
        regle39 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1351
        regle39 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1345
        regle39 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
