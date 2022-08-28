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
public class S_BLOC_MJAVA {
LEX_MJAVA scanner;
  S_BLOC_MJAVA() {
    }
  S_BLOC_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  InfoMethode att_methode_courante;
  InfoClasse att_classe_courante;
  int att_deplVariable;
  TDS<InfoClasse> att_tdc;
  String att_code;
  TDS<InfoVar> att_tdv;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle22() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_INSTS_MJAVA x_3 = new S_INSTS_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_22(x_3);
    x_2.analyser(LEX_MJAVA.token_aco);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_acf);
      action_code_22(x_3);
  }
private void action_code_22(S_INSTS_MJAVA x_3) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genBloc(x_3.att_code, this.att_tdv.size());
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_22(S_INSTS_MJAVA x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_classe_courante=this.att_classe_courante;
x_3.att_methode_courante=this.att_methode_courante;
x_3.att_tdc=this.att_tdc;
x_3.att_tdv=this.att_tdv;
x_3.att_deplVariable=this.att_deplVariable;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    regle22 () ;
  }
  }
