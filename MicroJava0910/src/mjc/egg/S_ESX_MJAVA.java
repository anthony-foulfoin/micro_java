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
public class S_ESX_MJAVA {
LEX_MJAVA scanner;
  S_ESX_MJAVA() {
    }
  S_ESX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  InfoMethode att_methode_courante;
  InfoClasse att_classe_courante;
  TDS<InfoClasse> att_tdc;
  String att_code;
  TDS<InfoVar> att_tdv;
  Type att_type;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle47() throws Exception {

    //declaration
    //appel
      action_type_47();
      action_code_47();
  }
  private void regle46() throws Exception {

    //declaration
    S_OPADD_MJAVA x_2 = new S_OPADD_MJAVA(scanner) ;
    S_T_MJAVA x_3 = new S_T_MJAVA(scanner) ;
    S_ESX_MJAVA x_4 = new S_ESX_MJAVA(scanner) ;
    //appel
      action_auto_inh_46(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
      action_type_46(x_2, x_3, x_4);
      action_code_46(x_2, x_3, x_4);
  }
private void action_type_46(S_OPADD_MJAVA x_2, S_T_MJAVA x_3, S_ESX_MJAVA x_4) throws Exception {
try {
// locales
String loc_nomOPADD;
String loc_nomT;
String loc_nomESX1;
// instructions
loc_nomOPADD=x_2.att_type.getNom();
loc_nomT=x_3.att_type.getNom();
if (loc_nomOPADD.equals("int")){
if (x_4.att_type!=null){
loc_nomESX1=x_4.att_type.getNom();
if (!(loc_nomESX1.equals("int"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_arith_invalide, MJAVAMessages.MJAVA_exp_arith_invalide,new Object[]{});

}

}

if (!(loc_nomT.equals("int"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_arith_invalide, MJAVAMessages.MJAVA_exp_arith_invalide,new Object[]{});

}

this.att_type= new Type("int", 1);
}
else if (loc_nomOPADD.equals("bool")){
if (x_4.att_type!=null){
loc_nomESX1=x_4.att_type.getNom();
if (!(loc_nomESX1.equals("bool"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_bool_invalide, MJAVAMessages.MJAVA_exp_bool_invalide,new Object[]{});

}

}

if (!(loc_nomT.equals("bool"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_arith_invalide, MJAVAMessages.MJAVA_exp_arith_invalide,new Object[]{});

}

this.att_type= new Type("bool", 1);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_arith_invalide, MJAVAMessages.MJAVA_exp_arith_invalide,new Object[]{});

}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_47() throws Exception {
try {
// locales
// instructions
this.att_type=null;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_46(S_OPADD_MJAVA x_2, S_T_MJAVA x_3, S_ESX_MJAVA x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_3.att_classe_courante=this.att_classe_courante;
x_4.att_classe_courante=this.att_classe_courante;
x_3.att_methode_courante=this.att_methode_courante;
x_4.att_methode_courante=this.att_methode_courante;
x_3.att_tdc=this.att_tdc;
x_4.att_tdc=this.att_tdc;
x_3.att_tdv=this.att_tdv;
x_4.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_46(S_OPADD_MJAVA x_2, S_T_MJAVA x_3, S_ESX_MJAVA x_4) throws Exception {
try {
// locales
String loc_valeur;
// instructions
loc_valeur=x_3.att_code;
if (x_3.att_affectable){
loc_valeur=x_3.att_code+this.att_machine.genChargValeurVar(1);
}

this.att_code=loc_valeur+x_2.att_code+x_4.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_47() throws Exception {
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
      case LEX_MJAVA.token_plus : // 1373
        regle46 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1374
        regle46 () ;
      break ;
      case LEX_MJAVA.token_ou : // 1375
        regle46 () ;
      break ;
      case LEX_MJAVA.token_inf : // 1367
        regle47 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 1368
        regle47 () ;
      break ;
      case LEX_MJAVA.token_sup : // 1369
        regle47 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 1370
        regle47 () ;
      break ;
      case LEX_MJAVA.token_eg : // 1371
        regle47 () ;
      break ;
      case LEX_MJAVA.token_neg : // 1372
        regle47 () ;
      break ;
      case LEX_MJAVA.token_affect : // 1353
        regle47 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1350
        regle47 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1351
        regle47 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1345
        regle47 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
