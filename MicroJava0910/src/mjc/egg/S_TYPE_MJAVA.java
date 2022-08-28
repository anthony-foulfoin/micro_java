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
public class S_TYPE_MJAVA {
LEX_MJAVA scanner;
  S_TYPE_MJAVA() {
    }
  S_TYPE_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS<InfoClasse> att_tdc;
  Type att_type;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle14() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_int);
      action_type_14();
  }
  private void regle15() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_bool);
      action_type_15();
  }
  private void regle16() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_ident);
      action_type_16(x_2);
  }
private void action_type_16(T_MJAVA x_2) throws Exception {
try {
// locales
InfoClasse loc_info;
// instructions
loc_info=this.att_tdc.chercherGlobalement(x_2.att_txt);
if (loc_info==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_type_inexistant, MJAVAMessages.MJAVA_type_inexistant,new Object[]{""+x_2.att_txt});

}

this.att_type=loc_info;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_15() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("bool", 1);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_14() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("int", 1);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 1358
        regle14 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1359
        regle15 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1386
        regle16 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
