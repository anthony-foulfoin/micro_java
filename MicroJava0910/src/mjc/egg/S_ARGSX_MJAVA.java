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
public class S_ARGSX_MJAVA {
LEX_MJAVA scanner;
  S_ARGSX_MJAVA() {
    }
  S_ARGSX_MJAVA(LEX_MJAVA scanner) {
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
  private void regle75() throws Exception {

    //declaration
    //appel
      action_type_75();
      action_code_75();
  }
  private void regle74() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_3 = new S_E_MJAVA(scanner) ;
    S_ARGSX_MJAVA x_5 = new S_ARGSX_MJAVA(scanner) ;
    //appel
      action_auto_inh_74(x_3, x_5);
    x_2.analyser(LEX_MJAVA.token_virg);
    x_3.analyser() ;
      action_type_74(x_3, x_5);
    x_5.analyser() ;
      action_code_74(x_3, x_5);
  }
private void action_code_74(S_E_MJAVA x_3, S_ARGSX_MJAVA x_5) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_5.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_74(S_E_MJAVA x_3, S_ARGSX_MJAVA x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_classe_courante=this.att_classe_courante;
x_5.att_classe_courante=this.att_classe_courante;
x_3.att_methode_courante=this.att_methode_courante;
x_5.att_methode_courante=this.att_methode_courante;
x_3.att_tdc=this.att_tdc;
x_5.att_tdc=this.att_tdc;
x_3.att_tdv=this.att_tdv;
x_5.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_75() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_75() throws Exception {
try {
// locales
Boolean loc_hasNext;
// instructions
loc_hasNext=this.att_params.hasNext();
if (loc_hasNext){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_nb_params1, MJAVAMessages.MJAVA_methode_nb_params1,new Object[]{});

}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_74(S_E_MJAVA x_3, S_ARGSX_MJAVA x_5) throws Exception {
try {
// locales
InfoVar loc_i;
Type loc_t;
Boolean loc_hasNext;
// instructions
loc_hasNext=this.att_params.hasNext();
if (!(loc_hasNext)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_nb_params2, MJAVAMessages.MJAVA_methode_nb_params2,new Object[]{});

}

loc_i=this.att_params.next();
loc_t=loc_i.getType();
if (!(loc_t.isCompatible(x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_param_incor, MJAVAMessages.MJAVA_methode_param_incor,new Object[]{""+loc_t.getNom(), ""+x_3.att_type.getNom()});

}

x_5.att_params=this.att_params;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_virg : // 1350
        regle74 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1345
        regle75 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
