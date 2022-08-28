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
public class S_DEF_MJAVA {
LEX_MJAVA scanner;
  S_DEF_MJAVA() {
    }
  S_DEF_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_deplAttribut;
  InfoClasse att_classe_courante;
  int att_tailleAttribut;
  TDS<InfoClasse> att_tdc;
  boolean att_protectionPublic;
  boolean att_redefinition;
  String att_code;
  boolean att_estConstructeur;
  AbstractMachine att_machine;
  int att_deplMethodePublique;
  LEX_MJAVA att_scanner;
  InfoAttribut glob_10_info;
  InfoMethode glob_12_info;
  TDS<InfoMethode> glob_12_tableMethodes;
  InfoMethode glob_11_info;
  InfoMethode glob_13_info;
  TDS<InfoMethode> glob_11_tableMethodes;
  private void regle10() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_10(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_pv);
      action_creer_attribut_10(x_2, x_3);
      action_taille_10(x_2, x_3);
      action_code_10(x_2, x_3);
  }
  private void regle11() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_PARFS_MJAVA x_6 = new S_PARFS_MJAVA(scanner) ;
    T_MJAVA x_7 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_11 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_11(x_2, x_3, x_6, x_11);
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_paro);
      action_creer_methode_11(x_2, x_3, x_6, x_11);
    x_6.analyser() ;
    x_7.analyser(LEX_MJAVA.token_parf);
      action_inserer_methode_11(x_2, x_3, x_6, x_11);
      action_tdv_11(x_2, x_3, x_6, x_11);
      action_depl_11(x_2, x_3, x_6, x_11);
    x_11.analyser() ;
      action_taille_11(x_2, x_3, x_6, x_11);
      action_code_11(x_2, x_3, x_6, x_11);
  }
  private void regle12() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_PARFS_MJAVA x_6 = new S_PARFS_MJAVA(scanner) ;
    T_MJAVA x_7 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_11 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_12(x_3, x_6, x_11);
    x_2.analyser(LEX_MJAVA.token_void);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_paro);
      action_creer_methode_12(x_3, x_6, x_11);
    x_6.analyser() ;
    x_7.analyser(LEX_MJAVA.token_parf);
      action_inserer_methode_12(x_3, x_6, x_11);
      action_tdv_12(x_3, x_6, x_11);
      action_depl_12(x_3, x_6, x_11);
    x_11.analyser() ;
      action_taille_12(x_3, x_6, x_11);
      action_code_12(x_3, x_6, x_11);
  }
  private void regle13() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_PARFS_MJAVA x_5 = new S_PARFS_MJAVA(scanner) ;
    T_MJAVA x_6 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_10 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_13(x_2, x_5, x_10);
    x_2.analyser(LEX_MJAVA.token_ident);
    x_3.analyser(LEX_MJAVA.token_paro);
      action_creer_constructeur_13(x_2, x_5, x_10);
    x_5.analyser() ;
    x_6.analyser(LEX_MJAVA.token_parf);
      action_inserer_constructeur_13(x_2, x_5, x_10);
      action_tdv_13(x_2, x_5, x_10);
      action_depl_13(x_2, x_5, x_10);
    x_10.analyser() ;
      action_taille_13(x_2, x_5, x_10);
      action_code_13(x_2, x_5, x_10);
  }
private void action_inserer_constructeur_13(T_MJAVA x_2, S_PARFS_MJAVA x_5, S_BLOC_MJAVA x_10) throws Exception {
try {
// locales
// instructions
    glob_13_info.majDeplParams();
    this.att_classe_courante.setConstructeur(glob_13_info);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_creer_constructeur_13(T_MJAVA x_2, S_PARFS_MJAVA x_5, S_BLOC_MJAVA x_10) throws Exception {
try {
// locales
// instructions
if (!(x_2.att_txt.equals(this.att_classe_courante.getNom()))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_type_retour_manquant, MJAVAMessages.MJAVA_type_retour_manquant,new Object[]{""+x_2.att_txt});

}

if (this.att_classe_courante.getConstructeur()!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_constructeur_defini, MJAVAMessages.MJAVA_constructeur_defini,new Object[]{});

}

glob_13_info= new InfoMethode(x_2.att_txt, -1, this.att_protectionPublic, null, this.att_classe_courante);
x_5.att_methode_courante=glob_13_info;
x_10.att_methode_courante=glob_13_info;
this.att_redefinition=false;
this.att_estConstructeur=true;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_taille_10(S_TYPE_MJAVA x_2, T_MJAVA x_3) throws Exception {
try {
// locales
Type loc_t;
// instructions
loc_t=glob_10_info.getType();
if (loc_t instanceof InfoClasse ){
this.att_tailleAttribut=1;
}
else {
this.att_tailleAttribut=loc_t.getTaille();

}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_taille_12(T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
// instructions
this.att_tailleAttribut=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_taille_11(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
// instructions
this.att_tailleAttribut=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_inserer_methode_11(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
// instructions
    glob_11_info.majDeplParams();
    glob_11_tableMethodes.put(x_3.att_txt, glob_11_info);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_inserer_methode_12(T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
// instructions
    glob_12_info.majDeplParams();
    glob_12_tableMethodes.put(x_3.att_txt, glob_12_info);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_taille_13(T_MJAVA x_2, S_PARFS_MJAVA x_5, S_BLOC_MJAVA x_10) throws Exception {
try {
// locales
// instructions
this.att_tailleAttribut=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_depl_11(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
// instructions
x_11.att_deplVariable=3;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_depl_12(T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
// instructions
x_11.att_deplVariable=3;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_depl_13(T_MJAVA x_2, S_PARFS_MJAVA x_5, S_BLOC_MJAVA x_10) throws Exception {
try {
// locales
// instructions
x_10.att_deplVariable=3;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tdv_13(T_MJAVA x_2, S_PARFS_MJAVA x_5, S_BLOC_MJAVA x_10) throws Exception {
try {
// locales
// instructions
x_10.att_tdv= new TDS<InfoVar>(glob_13_info.getTableParametres());
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tdv_12(T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
// instructions
x_11.att_tdv= new TDS<InfoVar>(glob_12_info.getTableParametres());
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tdv_11(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
// instructions
x_11.att_tdv= new TDS<InfoVar>(glob_11_info.getTableParametres());
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_creer_attribut_10(S_TYPE_MJAVA x_2, T_MJAVA x_3) throws Exception {
try {
// locales
TDS<InfoAttribut> loc_tableAttributs;
// instructions
this.att_redefinition=false;
this.att_estConstructeur=false;
loc_tableAttributs=this.att_classe_courante.getTableAttributs();
glob_10_info=loc_tableAttributs.chercherLocalement(x_3.att_txt);
if (glob_10_info!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_attribut_defini, MJAVAMessages.MJAVA_attribut_defini,new Object[]{""+x_3.att_txt});

}

glob_10_info= new InfoAttribut(this.att_deplAttribut, this.att_protectionPublic, x_2.att_type, this.att_classe_courante, x_3.att_txt);
    loc_tableAttributs.put(x_3.att_txt, glob_10_info);
    this.att_classe_courante.setDernierAttribut(glob_10_info);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_13(T_MJAVA x_2, S_PARFS_MJAVA x_5, S_BLOC_MJAVA x_10) throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genCodeConstructeur(glob_13_info, x_10.att_code, this.att_classe_courante);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_12(T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genCodeMethode(glob_12_info, x_11.att_code, this.att_classe_courante);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_11(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genCodeMethode(glob_11_info, x_11.att_code, this.att_classe_courante);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_creer_methode_12(T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
int loc_depl;
boolean loc_redefinition;
// instructions
glob_12_tableMethodes=this.att_classe_courante.getTableMethodes();
loc_redefinition=false;
if (this.att_protectionPublic){
loc_depl=this.att_deplMethodePublique;
}
else {
loc_depl=-1;
}
if ((x_3.att_txt.equalsIgnoreCase(this.att_classe_courante.getNom()))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_nom_classe, MJAVAMessages.MJAVA_methode_nom_classe,new Object[]{});

}

glob_12_info=glob_12_tableMethodes.chercherLocalement(x_3.att_txt);
if (glob_12_info!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_definie, MJAVAMessages.MJAVA_methode_definie,new Object[]{""+x_3.att_txt});

}

glob_12_info=glob_12_tableMethodes.chercherGlobalement(x_3.att_txt);
if (glob_12_info!=null){
if (glob_12_info.estPublic()){
if (!(this.att_protectionPublic)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_reduction_visibilite, MJAVAMessages.MJAVA_reduction_visibilite,new Object[]{""+x_3.att_txt});

}

loc_redefinition=true;
loc_depl=glob_12_info.getDeplacement();
}

}

glob_12_info= new InfoMethode(x_3.att_txt, loc_depl, this.att_protectionPublic, null, this.att_classe_courante);
x_6.att_methode_courante=glob_12_info;
x_11.att_methode_courante=glob_12_info;
this.att_redefinition=loc_redefinition;
this.att_estConstructeur=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_10(S_TYPE_MJAVA x_2, T_MJAVA x_3) throws Exception {
try {
// locales
// instructions
this.att_code="";
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_creer_methode_11(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// locales
int loc_depl;
boolean loc_redefinition;
// instructions
glob_11_tableMethodes=this.att_classe_courante.getTableMethodes();
loc_redefinition=false;
if (this.att_protectionPublic){
loc_depl=this.att_deplMethodePublique;
}
else {
loc_depl=-1;
}
if ((x_3.att_txt.equalsIgnoreCase(this.att_classe_courante.getNom()))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_nom_classe, MJAVAMessages.MJAVA_methode_nom_classe,new Object[]{});

}

glob_11_info=glob_11_tableMethodes.chercherLocalement(x_3.att_txt);
if (glob_11_info!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_methode_definie, MJAVAMessages.MJAVA_methode_definie,new Object[]{""+x_3.att_txt});

}

glob_11_info=glob_11_tableMethodes.chercherGlobalement(x_3.att_txt);
if (glob_11_info!=null){
if (glob_11_info.estPublic()){
if (!(this.att_protectionPublic)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_reduction_visibilite, MJAVAMessages.MJAVA_reduction_visibilite,new Object[]{""+x_3.att_txt});

}

loc_redefinition=true;
loc_depl=glob_11_info.getDeplacement();
}

}

glob_11_info= new InfoMethode(x_3.att_txt, loc_depl, this.att_protectionPublic, x_2.att_type, this.att_classe_courante);
x_6.att_methode_courante=glob_11_info;
x_11.att_methode_courante=glob_11_info;
this.att_redefinition=loc_redefinition;
this.att_estConstructeur=false;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_10(S_TYPE_MJAVA x_2, T_MJAVA x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_2.att_tdc=this.att_tdc;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_11(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_11.att_machine=this.att_machine;
x_11.att_classe_courante=this.att_classe_courante;
x_2.att_tdc=this.att_tdc;
x_6.att_tdc=this.att_tdc;
x_11.att_tdc=this.att_tdc;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_12(T_MJAVA x_3, S_PARFS_MJAVA x_6, S_BLOC_MJAVA x_11) throws Exception {
try {
// instructions
x_6.att_machine=this.att_machine;
x_11.att_machine=this.att_machine;
x_11.att_classe_courante=this.att_classe_courante;
x_6.att_tdc=this.att_tdc;
x_11.att_tdc=this.att_tdc;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_13(T_MJAVA x_2, S_PARFS_MJAVA x_5, S_BLOC_MJAVA x_10) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_10.att_machine=this.att_machine;
x_10.att_classe_courante=this.att_classe_courante;
x_5.att_tdc=this.att_tdc;
x_10.att_tdc=this.att_tdc;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 1358
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 1386
            scanner.lit ( 3 ) ;
            switch ( scanner.fenetre[2].code ) {
              case LEX_MJAVA.token_pv : // 1351
                regle10 () ;
              break ;
              case LEX_MJAVA.token_paro : // 1344
                regle11 () ;
              break ;
              default :
                       scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[2].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
            }
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_int);
        }
      break ;
      case LEX_MJAVA.token_bool : // 1359
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 1386
            scanner.lit ( 3 ) ;
            switch ( scanner.fenetre[2].code ) {
              case LEX_MJAVA.token_pv : // 1351
                regle10 () ;
              break ;
              case LEX_MJAVA.token_paro : // 1344
                regle11 () ;
              break ;
              default :
                       scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[2].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
            }
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_bool);
        }
      break ;
      case LEX_MJAVA.token_ident : // 1386
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 1386
            scanner.lit ( 3 ) ;
            switch ( scanner.fenetre[2].code ) {
              case LEX_MJAVA.token_pv : // 1351
                regle10 () ;
              break ;
              case LEX_MJAVA.token_paro : // 1344
                regle11 () ;
              break ;
              default :
                       scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[2].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
            }
          break ;
          case LEX_MJAVA.token_paro : // 1344
            regle13 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
        }
      break ;
      case LEX_MJAVA.token_void : // 1357
        regle12 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
