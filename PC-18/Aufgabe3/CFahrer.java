/*
 * @cond LICENSE
 * ######################################################################################
 * # Creative Commons BY SA                                                             #
 * #                                                                                    #
 * # Authored by Jörg Müller 2019                                                       #
 * ######################################################################################
 * @endcond
 */


 /**
  * Beschreibt den Fahrer eines Autos, der eine Fahrstrategie implementiert.
  * Kern ist die Methode fahre(), in der Fahrentscheidungen getroffen werden 
  * (beschleunigen, schalten, bremsen)
  */
public class CFahrer {
 
    private static final int MAX_SPEED=200;

    private final String m_name;
    private final int m_wunschGeschwindigkeit; 
    private final EFahrerTyp m_typ; // beeinflusst Stärke der Beschleunigung
    private final EAutoTyp m_typA; // beeinflusst Stärke der Beschleunigung
    private final CAuto m_auto;
    private int m_erreichbareGeschwindigkeit;




  // --- definiere Methoden ---


   /**
   * Konstruktor
   * @param p_name Name des Fahrers
   * @param p_typ Enum-Wert mit Fahrertyp
   * @param p_typA Enum-Wert mit Autotyp
   * @param p_wunschGeschwindigkeit  Wunschgeschwindigkeit des Fahrers
   * @param p_auto Referenz auf das CAuto, das der Fahrer fährt 
   */
    public CFahrer(final String p_name, final EFahrerTyp p_typ, final int p_wunschGeschwindigkeit, final CAuto p_auto)
    {
        m_name = p_name;
        m_typ = p_typ;
        m_typA = p_auto.getAutotyp();
        m_wunschGeschwindigkeit = Math.min(p_wunschGeschwindigkeit, CFahrer.MAX_SPEED);
        m_auto = p_auto;
    }

    /**
     * Diese Methode trifft die nächste Entscheidung und ruft (eine) entsprechende Aktion(en)
     * d.h. Methode(n) von CAuto auf
     */
    public void fahre()
    {
        if (m_auto.getAktGeschwindigkeit() < m_wunschGeschwindigkeit)
        {
            // berechne Beschleunigungsstärke basierend auf Fahrertyp
            int l_speedInkrement=3; // das ist das Inkrement für Fahrertyp NORMAL
            switch (m_typ) 
            {
                case ENTSPANNT :
                    l_speedInkrement=2;
                    break;
                case SPORTLICH:
                    l_speedInkrement=4;
                    break;
                default: //Fahrertyp NORMAL --> og. Wert übernehmen
                    break;
            }

            switch (m_typA) 
            {
                case LANGSAM :
                    l_speedInkrement--;
                    break;
                case SCHNELL :
                    l_speedInkrement++;
                    break;
                default: //Autotyp NORMAL --> og. Wert übernehmen
                    break;
            }
            // beschleunige das Fahrzeug
            m_auto.beschleunige(l_speedInkrement);
            }
        }
    

    @Override
    public String toString(){
        return "Fahrer: " + m_name + " " + m_auto.toString();
        
    }
}