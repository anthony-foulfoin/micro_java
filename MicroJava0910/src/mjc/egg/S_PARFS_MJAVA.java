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
public class S_PARFS_MJAVA {
LEX_MJAVA scanner;
  S_PARFS_MJAVA() {
    }
  S_PARFS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  InfoMethode att_methode_courante;
  TDS<InfoClasse> att_tdc;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle18() throws Exception {

    //declaration
    S_PARF_MJAVA x_2 = new S_PARF_MJAVA(scanner) ;
    S_PARFSX_MJAVA x_3 = new S_PARFSX_MJAVA(scanner) ;
    //appel
      action_auto_inh_18(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle17() throws Exception {

    //declaration
    //appel
  }
private void action_auto_inh_18(S_PARF_MJAVA x_2, S_PARFSX_MJAVA x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_2.att_methode_courante=this.att_methode_courante;
x_3.att_methode_courante=this.att_methode_courante;
x_2.att_tdc=this.att_tdc;
x_3.att_tdc=this.att_tdc;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_parf : // 1345
        regle17 () ;
      break ;
      case LEX_MJAVA.token_int : // 1358
        regle18 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1359
        regle18 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1386
        regle18 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
