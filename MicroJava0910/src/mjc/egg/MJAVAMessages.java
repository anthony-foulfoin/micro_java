package mjc.egg;
import java.util.ResourceBundle;
import mg.egg.eggc.compiler.libjava.messages.NLS;
public class MJAVAMessages extends NLS {
  private static final long serialVersionUID = 1L;
  private static final String BUNDLE_NAME = "mjc.properties.MJAVAMessages";
  private MJAVAMessages() {
  // Do not instantiate
  }
  static {
  NLS.initializeMessages(BUNDLE_NAME, mjc.egg.MJAVAMessages.class);
  }
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
  public static ResourceBundle getResourceBundle() {
  return RESOURCE_BUNDLE;
  }		

  public static  String MJAVA_expected_token;
  public static  String MJAVA_unexpected_token;
  public static  String MJAVA_expected_eof;
  public static  String MJAVA_classe_definie;
  public static  String MJAVA_classe_inconnue;
  public static  String MJAVA_attribut_defini;
  public static  String MJAVA_methode_nom_classe;
  public static  String MJAVA_methode_definie;
  public static  String MJAVA_reduction_visibilite;
  public static  String MJAVA_type_retour_manquant;
  public static  String MJAVA_constructeur_defini;
  public static  String MJAVA_type_inexistant;
  public static  String MJAVA_paramOuVar_defini;
  public static  String MJAVA_types_incompatibles;
  public static  String MJAVA_type_conditionnelle;
  public static  String MJAVA_exp_non_affectable;
  public static  String MJAVA_exp_rel_invalide;
  public static  String MJAVA_exp_arith_invalide;
  public static  String MJAVA_exp_bool_invalide;
  public static  String MJAVA_exp_unaire_invalide;
  public static  String MJAVA_type_invalide;
  public static  String MJAVA_visibilite_constructeur;
  public static  String MJAVA_ident_introuvable;
  public static  String MJAVA_visibilite_methode;
  public static  String MJAVA_visibilite_attribut;
  public static  String MJAVA_acces_attribut_primitif;
  public static  String MJAVA_methode_inconnue;
  public static  String MJAVA_methode_nb_params2;
  public static  String MJAVA_methode_param_incor;
  public static  String MJAVA_methode_nb_params1;
  }
