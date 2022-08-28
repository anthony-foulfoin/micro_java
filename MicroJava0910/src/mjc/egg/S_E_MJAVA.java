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
public class S_E_MJAVA {
LEX_MJAVA scanner;
  S_E_MJAVA() {
    }
  S_E_MJAVA(LEX_MJAVA scanner) {
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
  private void regle33() throws Exception {

    //declaration
    S_ER_MJAVA x_2 = new S_ER_MJAVA(scanner) ;
    S_AFFX_MJAVA x_3 = new S_AFFX_MJAVA(scanner) ;
    //appel
      action_auto_inh_33(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
      action_type_33(x_2, x_3);
      action_code_33(x_2, x_3);
  }
private void action_code_33(S_ER_MJAVA x_2, S_AFFX_MJAVA x_3) throws Exception {
try {
// locales
String loc_valeur;
// instructions
loc_valeur="";
if (x_3.att_type!=null){
if (x_3.att_affectable){
loc_valeur=x_3.att_code+this.att_machine.genChargValeurVar(1);
}
else {
loc_valeur=x_3.att_code;
}
}

this.att_code=this.att_machine.genAffectation(x_2.att_code, loc_valeur);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_33(S_ER_MJAVA x_2, S_AFFX_MJAVA x_3) throws Exception {
try {
// locales
// instructions
this.att_affectable=x_2.att_affectable;
if (x_3.att_type!=null){
this.att_affectable=false;
if (!(x_2.att_affectable)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_non_affectable, MJAVAMessages.MJAVA_exp_non_affectable,new Object[]{});

}

if (!(x_2.att_type.isCompatible(x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_types_incompatibles, MJAVAMessages.MJAVA_types_incompatibles,new Object[]{""+x_2.att_type.getNom(), ""+x_3.att_type.getNom()});

}

}

this.att_type=x_2.att_type;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_33(S_ER_MJAVA x_2, S_AFFX_MJAVA x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_2.att_classe_courante=this.att_classe_courante;
x_3.att_classe_courante=this.att_classe_courante;
x_2.att_methode_courante=this.att_methode_courante;
x_3.att_methode_courante=this.att_methode_courante;
x_2.att_tdc=this.att_tdc;
x_3.att_tdc=this.att_tdc;
x_2.att_tdv=this.att_tdv;
x_3.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    regle33 () ;
  }
  }
