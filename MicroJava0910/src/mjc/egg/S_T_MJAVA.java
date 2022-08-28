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
public class S_T_MJAVA {
LEX_MJAVA scanner;
  S_T_MJAVA() {
    }
  S_T_MJAVA(LEX_MJAVA scanner) {
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
  private void regle51() throws Exception {

    //declaration
    S_F_MJAVA x_2 = new S_F_MJAVA(scanner) ;
    S_TX_MJAVA x_3 = new S_TX_MJAVA(scanner) ;
    //appel
      action_auto_inh_51(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
      action_type_51(x_2, x_3);
      action_code_51(x_2, x_3);
  }
private void action_auto_inh_51(S_F_MJAVA x_2, S_TX_MJAVA x_3) throws Exception {
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
private void action_code_51(S_F_MJAVA x_2, S_TX_MJAVA x_3) throws Exception {
try {
// locales
String loc_valeur;
// instructions
loc_valeur=x_2.att_code;
if (x_3.att_type!=null){
if (x_2.att_affectable){
loc_valeur=x_2.att_code+this.att_machine.genChargValeurVar(1);
}

}

this.att_code=loc_valeur+x_3.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_51(S_F_MJAVA x_2, S_TX_MJAVA x_3) throws Exception {
try {
// locales
String loc_nomF;
String loc_nomTX;
// instructions
loc_nomF=x_2.att_type.getNom();
if (x_3.att_type!=null){
loc_nomTX=x_3.att_type.getNom();
if (loc_nomTX.equals("int")){
if (!(loc_nomF.equals("int"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_arith_invalide, MJAVAMessages.MJAVA_exp_arith_invalide,new Object[]{});

}

this.att_type= new Type("int", 1);
this.att_affectable=false;
}
else if (loc_nomTX.equals("bool")){
if (!(loc_nomF.equals("bool"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_bool_invalide, MJAVAMessages.MJAVA_exp_bool_invalide,new Object[]{});

}

this.att_type= new Type("bool", 1);
this.att_affectable=false;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_arith_invalide, MJAVAMessages.MJAVA_exp_arith_invalide,new Object[]{});

}
}
else {
this.att_type=x_2.att_type;
this.att_affectable=x_2.att_affectable;
}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    regle51 () ;
  }
  }
