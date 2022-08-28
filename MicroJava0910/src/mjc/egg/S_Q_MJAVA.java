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
public class S_Q_MJAVA {
LEX_MJAVA scanner;
  S_Q_MJAVA() {
    }
  S_Q_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_affectable;
  String att_codeh;
  String att_code_methode;
  TDS<InfoClasse> att_tdc;
  Boolean att_estAttribut;
  Type att_typeh;
  String att_code;
  AbstractMachine att_machine;
  Type att_type;
  InfoMethode att_methode_courante;
  InfoClasse att_classe_courante;
  InfoMethode att_methodeh;
  String att_code_variable;
  String att_identh;
  Boolean att_est_local;
  TDS<InfoVar> att_tdv;
  LEX_MJAVA att_scanner;
  Type glob_70_type;
  TDS<InfoAttribut> glob_70_tablev;
  InfoVar glob_70_var;
  TDS<InfoMethode> glob_70_tablem;
  InfoMethode glob_70_met;
  private void regle69() throws Exception {

    //declaration
    //appel
      action_type_69();
      action_code_69();
  }
  private void regle71() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_ARGS_MJAVA x_4 = new S_ARGS_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_7 = new S_Q_MJAVA(scanner) ;
    //appel
      action_auto_inh_71(x_4, x_7);
    x_2.analyser(LEX_MJAVA.token_paro);
      action_typeh_71(x_4, x_7);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
      action_codeh_71(x_4, x_7);
    x_7.analyser() ;
      action_type_71(x_4, x_7);
      action_code_71(x_4, x_7);
  }
  private void regle70() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_7 = new S_Q_MJAVA(scanner) ;
    //appel
      action_auto_inh_70(x_3, x_7);
    x_2.analyser(LEX_MJAVA.token_pt);
    x_3.analyser(LEX_MJAVA.token_ident);
      action_typeh_70(x_3, x_7);
      action_visibilite_70(x_3, x_7);
      action_codeh_70(x_3, x_7);
    x_7.analyser() ;
      action_type_70(x_3, x_7);
      action_code_70(x_3, x_7);
  }
private void action_visibilite_70(T_MJAVA x_3, S_Q_MJAVA x_7) throws Exception {
try {
// locales
String loc_nom_classe_courante;
InfoClasse loc_classe_contenante;
// instructions
if (glob_70_met!=null){
if (!(glob_70_met.estPublic())){
loc_nom_classe_courante=this.att_classe_courante.getNom();
loc_classe_contenante=glob_70_met.getClasseContenante();
if (!(loc_nom_classe_courante.equals(loc_classe_contenante.getNom()))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_visibilite_methode, MJAVAMessages.MJAVA_visibilite_methode,new Object[]{""+glob_70_met.getNom(), ""+loc_classe_contenante.getNom()});

}

}

}
else {
if (glob_70_var instanceof InfoAttribut ){
if (!(((InfoAttribut)glob_70_var).estPublic())){
loc_nom_classe_courante=this.att_classe_courante.getNom();
loc_classe_contenante=((InfoAttribut)glob_70_var).getClasseContenante();
if (!(loc_nom_classe_courante.equals(loc_classe_contenante.getNom()))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_visibilite_attribut, MJAVAMessages.MJAVA_visibilite_attribut,new Object[]{""+((InfoAttribut)glob_70_var).getNom(), ""+loc_classe_contenante.getNom()});

}

}

}

}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_71(S_ARGS_MJAVA x_4, S_Q_MJAVA x_7) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_4.att_classe_courante=this.att_classe_courante;
x_7.att_classe_courante=this.att_classe_courante;
x_4.att_methode_courante=this.att_methode_courante;
x_7.att_methode_courante=this.att_methode_courante;
x_4.att_tdc=this.att_tdc;
x_7.att_tdc=this.att_tdc;
x_4.att_tdv=this.att_tdv;
x_7.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_70(T_MJAVA x_3, S_Q_MJAVA x_7) throws Exception {
try {
// instructions
x_7.att_machine=this.att_machine;
x_7.att_classe_courante=this.att_classe_courante;
x_7.att_methode_courante=this.att_methode_courante;
x_7.att_tdc=this.att_tdc;
x_7.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_69() throws Exception {
try {
// instructions
this.att_code="";
if ((this.att_code_variable.equals(""))){
this.att_code=this.att_codeh+this.att_code_methode;
}
else {
this.att_code=this.att_codeh+this.att_code_variable;
}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_69() throws Exception {
try {
// locales
// instructions
this.att_type=this.att_typeh;
if (!(this.att_estAttribut)){
this.att_affectable=false;
}
else {
this.att_affectable=true;
}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_typeh_71(S_ARGS_MJAVA x_4, S_Q_MJAVA x_7) throws Exception {
try {
// locales
// instructions
if (this.att_methodeh==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_inconnue, MJAVAMessages.MJAVA_methode_inconnue,new Object[]{""+this.att_identh});

}

x_4.att_params=this.att_methodeh.getIteratorParamsEtVars();
x_7.att_identh="";
x_7.att_methodeh=null;
x_7.att_typeh=this.att_methodeh.getTypeRetour();
x_7.att_est_local=this.att_est_local;
x_7.att_estAttribut=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_typeh_70(T_MJAVA x_3, S_Q_MJAVA x_7) throws Exception {
try {
// instructions
if (this.att_typeh instanceof InfoClasse ){
glob_70_tablev=((InfoClasse)this.att_typeh).getTableAttributs();
glob_70_var=glob_70_tablev.chercherGlobalement(x_3.att_txt);
glob_70_tablem=((InfoClasse)this.att_typeh).getTableMethodes();
glob_70_met=glob_70_tablem.chercherGlobalement(x_3.att_txt);
glob_70_type=null;
if (glob_70_var!=null){
glob_70_type=glob_70_var.getType();
}

if (glob_70_met==null&&glob_70_type==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_ident_introuvable, MJAVAMessages.MJAVA_ident_introuvable,new Object[]{""+x_3.att_txt});

}

x_7.att_identh=x_3.att_txt;
x_7.att_methodeh=glob_70_met;
x_7.att_typeh=glob_70_type;
x_7.att_est_local=false;
x_7.att_estAttribut=true;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_acces_attribut_primitif, MJAVAMessages.MJAVA_acces_attribut_primitif,new Object[]{""+this.att_typeh.getNom()});


}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_71(S_ARGS_MJAVA x_4, S_Q_MJAVA x_7) throws Exception {
try {
// instructions
this.att_code=x_7.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_codeh_71(S_ARGS_MJAVA x_4, S_Q_MJAVA x_7) throws Exception {
try {
// locales
// instructions
x_7.att_code_variable="";
x_7.att_codeh=this.att_codeh;
x_7.att_code_methode=this.att_machine.genAppelMethode(this.att_methodeh, x_4.att_code, this.att_est_local, this.att_methode_courante);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_codeh_70(T_MJAVA x_3, S_Q_MJAVA x_7) throws Exception {
try {
// locales
// instructions
x_7.att_code_variable="";
x_7.att_codeh="";
x_7.att_code_methode="";
if ((this.att_code_variable.equals(""))){
x_7.att_codeh=this.att_codeh+this.att_code_methode;
}
else {
x_7.att_codeh=this.att_codeh+this.att_code_variable+this.att_machine.genChargValeurVar(1);
}
if (glob_70_var!=null){
x_7.att_code_variable=this.att_machine.genAppelVariable(glob_70_var, false, this.att_methode_courante);
}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_70(T_MJAVA x_3, S_Q_MJAVA x_7) throws Exception {
try {
// instructions
this.att_code=x_7.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_71(S_ARGS_MJAVA x_4, S_Q_MJAVA x_7) throws Exception {
try {
// locales
// instructions
this.att_type=x_7.att_type;
this.att_affectable=x_7.att_affectable;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_70(T_MJAVA x_3, S_Q_MJAVA x_7) throws Exception {
try {
// locales
// instructions
this.att_type=x_7.att_type;
this.att_affectable=x_7.att_affectable;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 1376
        regle69 () ;
      break ;
      case LEX_MJAVA.token_div : // 1377
        regle69 () ;
      break ;
      case LEX_MJAVA.token_mod : // 1378
        regle69 () ;
      break ;
      case LEX_MJAVA.token_et : // 1379
        regle69 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1373
        regle69 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1374
        regle69 () ;
      break ;
      case LEX_MJAVA.token_ou : // 1375
        regle69 () ;
      break ;
      case LEX_MJAVA.token_inf : // 1367
        regle69 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 1368
        regle69 () ;
      break ;
      case LEX_MJAVA.token_sup : // 1369
        regle69 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 1370
        regle69 () ;
      break ;
      case LEX_MJAVA.token_eg : // 1371
        regle69 () ;
      break ;
      case LEX_MJAVA.token_neg : // 1372
        regle69 () ;
      break ;
      case LEX_MJAVA.token_affect : // 1353
        regle69 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1350
        regle69 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1351
        regle69 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1345
        regle69 () ;
      break ;
      case LEX_MJAVA.token_pt : // 1352
        regle70 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1344
        regle71 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
