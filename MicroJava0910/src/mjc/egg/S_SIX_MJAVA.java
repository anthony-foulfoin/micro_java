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
public class S_SIX_MJAVA {
LEX_MJAVA scanner;
  S_SIX_MJAVA() {
    }
  S_SIX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  InfoMethode att_methode_courante;
  InfoClasse att_classe_courante;
  int att_deplVariable;
  TDS<InfoClasse> att_tdc;
  String att_code;
  TDS<InfoVar> att_tdv;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle29() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_4 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_29(x_4);
    x_2.analyser(LEX_MJAVA.token_sinon);
      action_tdv_29(x_4);
    x_4.analyser() ;
      action_code_29(x_4);
  }
  private void regle30() throws Exception {

    //declaration
    //appel
      action_code_30();
  }
private void action_auto_inh_29(S_BLOC_MJAVA x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_classe_courante=this.att_classe_courante;
x_4.att_methode_courante=this.att_methode_courante;
x_4.att_tdc=this.att_tdc;
x_4.att_deplVariable=this.att_deplVariable;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_29(S_BLOC_MJAVA x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tdv_29(S_BLOC_MJAVA x_4) throws Exception {
try {
// locales
// instructions
x_4.att_tdv= new TDS<InfoVar>(this.att_tdv);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_30() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_sinon : // 1355
        regle29 () ;
      break ;
      case LEX_MJAVA.token_int : // 1358
        regle30 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1359
        regle30 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1386
        regle30 () ;
      break ;
      case LEX_MJAVA.token_entier : // 1385
        regle30 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1381
        regle30 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1382
        regle30 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1373
        regle30 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1374
        regle30 () ;
      break ;
      case LEX_MJAVA.token_non : // 1380
        regle30 () ;
      break ;
      case LEX_MJAVA.token_null : // 1366
        regle30 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1344
        regle30 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1363
        regle30 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1346
        regle30 () ;
      break ;
      case LEX_MJAVA.token_si : // 1354
        regle30 () ;
      break ;
      case LEX_MJAVA.token_retour : // 1362
        regle30 () ;
      break ;
      case LEX_MJAVA.token_tantque : // 1356
        regle30 () ;
      break ;
      case LEX_MJAVA.token_acf : // 1347
        regle30 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
