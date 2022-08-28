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
public class S_F_MJAVA {
LEX_MJAVA scanner;
  S_F_MJAVA() {
    }
  S_F_MJAVA(LEX_MJAVA scanner) {
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
  TDS<InfoMethode> glob_68_tablem;
  InfoMethode glob_68_met;
  InfoVar glob_68_var;
  InfoMethode glob_67_constructeur;
  Type glob_68_type;
  private void regle60() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_faux);
      action_type_60();
      action_code_60();
  }
  private void regle61() throws Exception {

    //declaration
    S_OPUN_MJAVA x_2 = new S_OPUN_MJAVA(scanner) ;
    S_F_MJAVA x_3 = new S_F_MJAVA(scanner) ;
    //appel
      action_auto_inh_61(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
      action_type_61(x_2, x_3);
      action_code_61(x_2, x_3);
  }
  private void regle66() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_3 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_66(x_3);
    x_2.analyser(LEX_MJAVA.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_parf);
      action_type_66(x_3);
      action_code_66(x_3);
  }
  private void regle58() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_entier);
      action_type_58(x_2);
      action_code_58(x_2);
  }
  private void regle67() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_TYPE_MJAVA x_3 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_ARGS_MJAVA x_7 = new S_ARGS_MJAVA(scanner) ;
    T_MJAVA x_8 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_67(x_3, x_7);
    x_2.analyser(LEX_MJAVA.token_nouveau);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_paro);
      action_type_67(x_3, x_7);
      action_visibilite_67(x_3, x_7);
    x_7.analyser() ;
    x_8.analyser(LEX_MJAVA.token_parf);
      action_code_67(x_3, x_7);
  }
  private void regle65() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_null);
      action_type_65();
      action_code_65();
  }
  private void regle59() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_vrai);
      action_type_59();
      action_code_59();
  }
  private void regle68() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_6 = new S_Q_MJAVA(scanner) ;
    //appel
      action_auto_inh_68(x_2, x_6);
    x_2.analyser(LEX_MJAVA.token_ident);
      action_typeh_68(x_2, x_6);
      action_visibilite_68(x_2, x_6);
      action_codeh_68(x_2, x_6);
    x_6.analyser() ;
      action_type_68(x_2, x_6);
      action_code_68(x_2, x_6);
  }
private void action_type_65() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("null", 0);
this.att_affectable=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_66(S_E_MJAVA x_3) throws Exception {
try {
// locales
// instructions
this.att_type=x_3.att_type;
this.att_affectable=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_67(S_TYPE_MJAVA x_3, S_ARGS_MJAVA x_7) throws Exception {
try {
// locales
Iterator loc_test;
TDS loc_params;
// instructions
if (x_3.att_type instanceof InfoClasse ){
glob_67_constructeur=((InfoClasse)x_3.att_type).getConstructeur();
if (glob_67_constructeur!=null){
x_7.att_params=glob_67_constructeur.getIteratorParamsEtVars();
loc_test=glob_67_constructeur.getIteratorParamsEtVars();
loc_params=glob_67_constructeur.getTableParametres();
}
else {
x_7.att_params=null;
}
this.att_type=((InfoClasse)x_3.att_type);
this.att_affectable=false;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_type_invalide, MJAVAMessages.MJAVA_type_invalide,new Object[]{""+x_3.att_type.getNom()});


}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_68(T_MJAVA x_2, S_Q_MJAVA x_6) throws Exception {
try {
// locales
// instructions
this.att_type=x_6.att_type;
this.att_affectable=x_6.att_affectable;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_67(S_TYPE_MJAVA x_3, S_ARGS_MJAVA x_7) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_7.att_classe_courante=this.att_classe_courante;
x_7.att_methode_courante=this.att_methode_courante;
x_3.att_tdc=this.att_tdc;
x_7.att_tdc=this.att_tdc;
x_7.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_61(S_OPUN_MJAVA x_2, S_F_MJAVA x_3) throws Exception {
try {
// locales
String loc_nomF1;
String loc_nomOPUN;
// instructions
loc_nomOPUN=x_2.att_type.getNom();
loc_nomF1=x_3.att_type.getNom();
if (loc_nomOPUN.equals("int")){
if (!(loc_nomF1.equals("int"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_unaire_invalide, MJAVAMessages.MJAVA_exp_unaire_invalide,new Object[]{});

}

this.att_type= new Type("int", 1);
}
else if (loc_nomOPUN.equals("bool")){
if (!(loc_nomF1.equals("bool"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_exp_bool_invalide, MJAVAMessages.MJAVA_exp_bool_invalide,new Object[]{});

}

this.att_type= new Type("bool", 1);
}

this.att_affectable=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_66(S_E_MJAVA x_3) throws Exception {
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
private void action_auto_inh_68(T_MJAVA x_2, S_Q_MJAVA x_6) throws Exception {
try {
// instructions
x_6.att_machine=this.att_machine;
x_6.att_classe_courante=this.att_classe_courante;
x_6.att_methode_courante=this.att_methode_courante;
x_6.att_tdc=this.att_tdc;
x_6.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_68(T_MJAVA x_2, S_Q_MJAVA x_6) throws Exception {
try {
// instructions
this.att_code=x_6.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_codeh_68(T_MJAVA x_2, S_Q_MJAVA x_6) throws Exception {
try {
// locales
// instructions
x_6.att_code_variable="";
x_6.att_codeh="";
x_6.att_code_methode="";
if (glob_68_var!=null){
x_6.att_code_variable=this.att_machine.genAppelVariable(glob_68_var, true, this.att_methode_courante);
}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_66(S_E_MJAVA x_3) throws Exception {
try {
// locales
// instructions
this.att_code=x_3.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_67(S_TYPE_MJAVA x_3, S_ARGS_MJAVA x_7) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genAppelConstructeur(x_3.att_type.getNom(), x_7.att_code);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_58(T_MJAVA x_2) throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genEntier(x_2.att_txt);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_58(T_MJAVA x_2) throws Exception {
try {
// locales
// instructions
this.att_type= new Type("int", 1);
this.att_affectable=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_59() throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genBool(true);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_61(S_OPUN_MJAVA x_2, S_F_MJAVA x_3) throws Exception {
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
private void action_type_59() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("bool", 1);
this.att_affectable=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_65() throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genNullPointeur();
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_visibilite_68(T_MJAVA x_2, S_Q_MJAVA x_6) throws Exception {
try {
// locales
String loc_nom_classe_courante;
InfoClasse loc_classe_contenante;
// instructions
if (glob_68_met!=null){
if (!(glob_68_met.estPublic())){
loc_nom_classe_courante=this.att_classe_courante.getNom();
loc_classe_contenante=glob_68_met.getClasseContenante();
if (!(loc_nom_classe_courante.equals(loc_classe_contenante.getNom()))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_visibilite_methode, MJAVAMessages.MJAVA_visibilite_methode,new Object[]{""+glob_68_met.getNom(), ""+loc_classe_contenante.getNom()});

}

}

}
else {
if (glob_68_var instanceof InfoAttribut ){
if (!(((InfoAttribut)glob_68_var).estPublic())){
loc_nom_classe_courante=this.att_classe_courante.getNom();
loc_classe_contenante=((InfoAttribut)glob_68_var).getClasseContenante();
if (!(loc_nom_classe_courante.equals(loc_classe_contenante.getNom()))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_visibilite_attribut, MJAVAMessages.MJAVA_visibilite_attribut,new Object[]{""+((InfoAttribut)glob_68_var).getNom(), ""+loc_classe_contenante.getNom()});

}

}

}

}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_typeh_68(T_MJAVA x_2, S_Q_MJAVA x_6) throws Exception {
try {
// instructions
glob_68_var=this.att_tdv.chercherGlobalement(x_2.att_txt);
glob_68_tablem=this.att_classe_courante.getTableMethodes();
glob_68_met=glob_68_tablem.chercherGlobalement(x_2.att_txt);
glob_68_type=null;
if (glob_68_var!=null){
glob_68_type=glob_68_var.getType();
}

if (glob_68_met==null&&glob_68_type==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_ident_introuvable, MJAVAMessages.MJAVA_ident_introuvable,new Object[]{""+x_2.att_txt});

}

x_6.att_identh=x_2.att_txt;
x_6.att_methodeh=glob_68_met;
x_6.att_typeh=glob_68_type;
x_6.att_est_local=true;
x_6.att_estAttribut=true;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_visibilite_67(S_TYPE_MJAVA x_3, S_ARGS_MJAVA x_7) throws Exception {
try {
// locales
String loc_nom_classe_courante;
// instructions
if (!(glob_67_constructeur.estPublic())){
loc_nom_classe_courante=this.att_classe_courante.getNom();
if (!(loc_nom_classe_courante.equals(x_3.att_type.getNom()))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_visibilite_constructeur, MJAVAMessages.MJAVA_visibilite_constructeur,new Object[]{""+glob_67_constructeur.getNom()});

}

}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_61(S_OPUN_MJAVA x_2, S_F_MJAVA x_3) throws Exception {
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
private void action_code_60() throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genBool(false);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_60() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("bool", 1);
this.att_affectable=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_entier : // 1385
        regle58 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1381
        regle59 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1382
        regle60 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1373
        regle61 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1374
        regle61 () ;
      break ;
      case LEX_MJAVA.token_non : // 1380
        regle61 () ;
      break ;
      case LEX_MJAVA.token_null : // 1366
        regle65 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1344
        regle66 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1363
        regle67 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1386
        regle68 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
