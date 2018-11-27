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
  * Einfache Klasse für Auto
  */
public class CAuto implements iFahrzeug {
  // --- definiere Eigenschaften ---

  private static final int MAX_BESCHLEUNIGUNG = 5;
  private static final int MAX_VERZOEGERUNG = 3;

  private static int s_id; // zähler für fz ids, initial 0

  // unveränderbare Eigenschaft durch final  

  private final String m_farbe;
  private final String m_marke;
  private final EAutoTyp m_typA;
  private final int m_maxGeschwindigkeit;
  private final int m_anzahlGaenge;
  private final CSeriennr m_SNR;

  // veränderbare Eigenschaften
  private int m_aktGeschwindigkeit; // initial 0
  private int m_gang = 1; // aktueller Gang - hier wird ein Wert vorgegeben
  private int m_position; // hier merkt sich das Auto seine Position auf der Straße, initial 0

  /**
   * Konstruktor
   * @param p_farbe Farbe des Autos
   * @param p_marke Automarke
   * @param p_anzahlGaenge  Anzahl der Gänge
   * @param p_maxGeschwindigkeit Höchstgeschwindigkeit 
   */
    public CAuto( final String p_farbe, final String p_marke, final EAutoTyp p_typA, final int p_anzahlGaenge, final int p_maxGeschwindigkeit)
    {
        m_farbe = p_farbe;
        m_marke = p_marke;
        m_typA = p_typA;
        m_anzahlGaenge = p_anzahlGaenge;
        m_maxGeschwindigkeit = p_maxGeschwindigkeit;
        m_SNR = new CSeriennr(s_id++);
    }

//Klasse erstellen CSerial

//Definition der Variablen

//Zehnerwert 
//A = m_autoId/10

//Einserwert
//B = m_autoId %

//int A = 0
//int B = 0

//System.out.println (A "-" B)

    /**
    * Getter Methode für den Autotypen
    * @return der jeweilige Autotyp
     */

    public String getm_SNR()
    {   
        return m_SNR.getvSerial();
    }

    public EAutoTyp getAutotyp(){
        return m_typA;
    }

    /**
     * Getter Methode für die eindeutige ID
     * @return der int Wert der ID
     */
   // public int getAutoId(){
        
     //   return m_autoId;
    //}

    /**
     * Getter Methode für die aktuelle Geschwindigkeit
     * @return aktueller Wert als int
     */
    public int getAktGeschwindigkeit(){
        return m_aktGeschwindigkeit;
    }
 
    /**
     * Getter Methode für die aktuelle Position des Autos. Wir nehmen an, dass
     * diese auf einem Strahl mit Ausgangspunkt 0 definiert ist. 
     * @return aktueller Wert als int
     */
    public int getPosition(){
        return m_position;
    }

    /**
     * Erhöht Positionswert um ein Inkrement
     * @param p_inc nicht negativer ganzzahliger Wert für Inkrement 
     */
    public void incrementPosition(int p_inc){
        m_position = p_inc > 0 ? m_position + p_inc : m_position;
    }

    /**
     * Ändern des eingelegten Ganges. 
     * @param p_inc zulässiger Wert für Gang.
     */
     public void schalte( final int p_gang )
    {
        // in dieser Implementierung kann man von jedem Gang in jeden anderen schalten
        m_gang = p_gang % (m_anzahlGaenge + 1);
        m_gang = m_gang < 0 ? 0 : m_gang;
    }

    /**
     * Realisiert beschleunigen durch Addieren eines positiven ganzzahligen Wertes zur Geschwindikeit 
     * @param p_inkrement zulässiger Wert für Anzahl der Einheiten, die beschleunigt werden
     */
    public void beschleunige( final int p_inkrement )
    {
        if (p_inkrement < 0) throw new IllegalArgumentException("negative value for increment: " + p_inkrement);

        m_aktGeschwindigkeit += Math.min(p_inkrement, MAX_BESCHLEUNIGUNG);
        m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
    }

    /**
     * Realisiert bremsen durch Verringern der Geschwindigkeit um einen positiven ganzzahligen Wert  
     * @param p_inc zulässiger Wert für Anzahl der Einheiten, die beschleunigt werden
     */
    public void bremse( final int p_dekrement )
    {
        if (p_dekrement < 0) throw new IllegalArgumentException("negative value for decrement: " + p_dekrement);
     
        m_aktGeschwindigkeit -= Math.min(p_dekrement, MAX_VERZOEGERUNG);
        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
    }

    @Override
    public String toString(){
        return m_marke + " " + getm_SNR() + ": Position=" + m_position + "; Speed=" + m_aktGeschwindigkeit;
    }

    //@Override
    //public boolean equals(Object o) {

      //  if (o == this) return true;
      //  if (!(o instanceof CAuto)) {
      //      return false;
      //  }

       // CAuto auto = (CAuto) o;

       // return auto.getAutoId() == m_autoId;
    //}

 //   @Override
//    public int hashCode() {
//        return Integer.valueOf(m_autoId).hashCode();
  //  }
}