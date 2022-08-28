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
public class S_OPADD_MJAVA {
LEX_MJAVA scanner;
  S_OPADD_MJAVA() {
    }
  S_OPADD_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_code;
  Type att_type;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle50() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_ou);
      action_type_50();
      action_code_50();
  }
  private void regle48() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_plus);
      action_type_48();
      action_code_48();
  }
  private void regle49() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_moins);
      action_type_49();
      action_code_49();
  }
private void action_code_50() throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genOu();
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_50() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("bool", 1);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_48() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("int", 1);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_49() throws Exception {
try {
// locales
// instructions
this.att_type= new Type("int", 1);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_48() throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genPlus();
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_49() throws Exception {
try {
// locales
// instructions
this.att_code=this.att_machine.genMoins();
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_plus : // 1373
        regle48 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1374
        regle49 () ;
      break ;
      case LEX_MJAVA.token_ou : // 1375
        regle50 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
