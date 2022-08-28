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
public class S_PARF_MJAVA {
LEX_MJAVA scanner;
  S_PARF_MJAVA() {
    }
  S_PARF_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  InfoMethode att_methode_courante;
  TDS<InfoClasse> att_tdc;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle21() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_21(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
      action_creer_param_21(x_2, x_3);
  }
private void action_creer_param_21(S_TYPE_MJAVA x_2, T_MJAVA x_3) throws Exception {
try {
// locales
TDS<InfoVar> loc_tableParametres;
InfoVar loc_info;
// instructions
loc_tableParametres=this.att_methode_courante.getTableParametres();
loc_info=loc_tableParametres.chercherLocalement(x_3.att_txt);
if (loc_info!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_paramOuVar_defini, MJAVAMessages.MJAVA_paramOuVar_defini,new Object[]{""+x_3.att_txt});

}

loc_info= new InfoVar(-1, x_2.att_type, x_3.att_txt);
    loc_tableParametres.put(x_3.att_txt, loc_info);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_21(S_TYPE_MJAVA x_2, T_MJAVA x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_2.att_tdc=this.att_tdc;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    regle21 () ;
  }
  }
