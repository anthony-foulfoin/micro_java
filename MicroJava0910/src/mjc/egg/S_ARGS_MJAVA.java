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
public class S_ARGS_MJAVA {
LEX_MJAVA scanner;
  S_ARGS_MJAVA() {
    }
  S_ARGS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  InfoMethode att_methode_courante;
  InfoClasse att_classe_courante;
  TDS<InfoClasse> att_tdc;
  String att_code;
  Iterator<InfoVar> att_params;
  TDS<InfoVar> att_tdv;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle73() throws Exception {

    //declaration
    //appel
      action_type_73();
      action_code_73();
  }
  private void regle72() throws Exception {

    //declaration
    S_E_MJAVA x_2 = new S_E_MJAVA(scanner) ;
    S_ARGSX_MJAVA x_4 = new S_ARGSX_MJAVA(scanner) ;
    //appel
      action_auto_inh_72(x_2, x_4);
    x_2.analyser() ;
      action_type_72(x_2, x_4);
    x_4.analyser() ;
      action_code_72(x_2, x_4);
  }
private void action_code_72(S_E_MJAVA x_2, S_ARGSX_MJAVA x_4) throws Exception {
try {
// locales
String loc_valeur;
// instructions
loc_valeur=x_2.att_code;
if (x_2.att_affectable){
loc_valeur=x_2.att_code+this.att_machine.genChargValeurVar(1);
}

this.att_code=loc_valeur+x_4.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_73() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_72(S_E_MJAVA x_2, S_ARGSX_MJAVA x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_classe_courante=this.att_classe_courante;
x_4.att_classe_courante=this.att_classe_courante;
x_2.att_methode_courante=this.att_methode_courante;
x_4.att_methode_courante=this.att_methode_courante;
x_2.att_tdc=this.att_tdc;
x_4.att_tdc=this.att_tdc;
x_2.att_tdv=this.att_tdv;
x_4.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_73() throws Exception {
try {
// locales
Boolean loc_hasNext;
// instructions
loc_hasNext=false;
if (this.att_params!=null){
loc_hasNext=this.att_params.hasNext();
}

if (loc_hasNext){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_nb_params1, MJAVAMessages.MJAVA_methode_nb_params1,new Object[]{});

}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_72(S_E_MJAVA x_2, S_ARGSX_MJAVA x_4) throws Exception {
try {
// locales
InfoVar loc_i;
Type loc_t;
Boolean loc_hasNext;
// instructions
if (this.att_params==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_nb_params2, MJAVAMessages.MJAVA_methode_nb_params2,new Object[]{});

}

loc_hasNext=this.att_params.hasNext();
if (!(loc_hasNext)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_nb_params2, MJAVAMessages.MJAVA_methode_nb_params2,new Object[]{});

}

loc_i=this.att_params.next();
loc_t=loc_i.getType();
if (!(loc_t.isCompatible(x_2.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_param_incor, MJAVAMessages.MJAVA_methode_param_incor,new Object[]{""+loc_t.getNom(), ""+x_2.att_type.getNom()});

}

x_4.att_params=this.att_params;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_entier : // 1385
        regle72 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1381
        regle72 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1382
        regle72 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1373
        regle72 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1374
        regle72 () ;
      break ;
      case LEX_MJAVA.token_non : // 1380
        regle72 () ;
      break ;
      case LEX_MJAVA.token_null : // 1366
        regle72 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1344
        regle72 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1363
        regle72 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1386
        regle72 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1345
        regle73 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
