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
public class S_DEFCLASSE_MJAVA {
LEX_MJAVA scanner;
  S_DEFCLASSE_MJAVA() {
    }
  S_DEFCLASSE_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS<InfoClasse> att_tdc;
  String att_code;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  InfoMethode glob_4_constructeur_par_defaut;
  InfoClasse glob_4_info;
  private void regle4() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_EXTENSION_MJAVA x_4 = new S_EXTENSION_MJAVA(scanner) ;
    T_MJAVA x_7 = new T_MJAVA(scanner ) ;
    S_DEFS_MJAVA x_8 = new S_DEFS_MJAVA(scanner) ;
    T_MJAVA x_9 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_4(x_3, x_4, x_8);
    x_2.analyser(LEX_MJAVA.token_classe);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
      action_tdc_4(x_3, x_4, x_8);
      action_deplAttrMeth_4(x_3, x_4, x_8);
    x_7.analyser(LEX_MJAVA.token_aco);
    x_8.analyser() ;
    x_9.analyser(LEX_MJAVA.token_acf);
      action_verif_constructeur_4(x_3, x_4, x_8);
      action_code_4(x_3, x_4, x_8);
      action_deplTV_4(x_3, x_4, x_8);
  }
private void action_auto_inh_4(T_MJAVA x_3, S_EXTENSION_MJAVA x_4, S_DEFS_MJAVA x_8) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_8.att_machine=this.att_machine;
x_4.att_tdc=this.att_tdc;
x_8.att_tdc=this.att_tdc;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_deplTV_4(T_MJAVA x_3, S_EXTENSION_MJAVA x_4, S_DEFS_MJAVA x_8) throws Exception {
try {
// locales
TDS<InfoMethode> loc_tm;
MJC loc_mjc;
// instructions
loc_mjc= new MJC();
loc_tm=glob_4_info.getTableMethodes();
    loc_mjc.setDeplTVClasse(loc_mjc.getDeplTVClasse()+glob_4_info.getTailleTV());
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_verif_constructeur_4(T_MJAVA x_3, S_EXTENSION_MJAVA x_4, S_DEFS_MJAVA x_8) throws Exception {
try {
// locales
// instructions
glob_4_constructeur_par_defaut=null;
if (glob_4_info.getConstructeur()==null){
glob_4_constructeur_par_defaut= new InfoMethode(x_3.att_txt, -1, true, null, glob_4_info);
    glob_4_info.setConstructeur(glob_4_constructeur_par_defaut);
}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tdc_4(T_MJAVA x_3, S_EXTENSION_MJAVA x_4, S_DEFS_MJAVA x_8) throws Exception {
try {
// locales
MJC loc_mjc;
// instructions
glob_4_info=this.att_tdc.chercherGlobalement(x_3.att_txt);
if (glob_4_info!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_classe_definie, MJAVAMessages.MJAVA_classe_definie,new Object[]{""+x_3.att_txt});

}

loc_mjc= new MJC();
glob_4_info= new InfoClasse(x_4.att_classe_mere, loc_mjc.getDeplTVClasse(), x_3.att_txt);
    this.att_tdc.put(x_3.att_txt, glob_4_info);
x_8.att_classe_courante=glob_4_info;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_4(T_MJAVA x_3, S_EXTENSION_MJAVA x_4, S_DEFS_MJAVA x_8) throws Exception {
try {
// locales
String loc_code_constructeur_defaut;
// instructions
    glob_4_info.setCode(x_8.att_code);
if (glob_4_constructeur_par_defaut!=null){
    glob_4_info.setCode(glob_4_info.getCode()+this.att_machine.genCodeConstructeur(glob_4_constructeur_par_defaut, "", glob_4_info));
}

this.att_code=this.att_machine.genTableVirtuelles(this.att_tdc)+this.att_machine.genCodeClasses(this.att_tdc);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_deplAttrMeth_4(T_MJAVA x_3, S_EXTENSION_MJAVA x_4, S_DEFS_MJAVA x_8) throws Exception {
try {
// locales
InfoClasse loc_parente;
InfoAttribut loc_attr;
InfoMethode loc_meth;
int loc_depl;
// instructions
loc_parente=glob_4_info.getParente();
if ((loc_parente==null)){
x_8.att_deplAttribut=1;
x_8.att_deplMethodePublique=0;
}
else {
loc_attr=loc_parente.getDernierAttribut();
if (loc_attr==null){
loc_depl=1;
}
else {
loc_depl=loc_attr.getDeplacement()+1;
}
x_8.att_deplAttribut=loc_depl;
loc_meth=loc_parente.getDerniereMethPublique();
if (loc_meth==null){
loc_depl=0;
}
else {
loc_depl=loc_meth.getDeplacement()+1;
}
x_8.att_deplMethodePublique=loc_depl;
}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    regle4 () ;
  }
  }
