public class CMotorrad implements IFahrzeug 
{
    private static final int MAX_BESCHLEUNIGUNG = 5;
  private static final int MAX_VERZOEGERUNG = 3;

  private static int s_id; 
 
  protected final int m_motorradId;
  protected final String m_marke;
  protected final String m_farbe;
  protected final int m_maxGeschwindigkeit;
  protected final int m_anzahlGaenge;
  protected final boolean m_beiwagen;

  protected int m_aktGeschwindigkeit;
  protected int m_gang = 1;
  protected int m_position; 

  /**
   * Konstruktor
   * @param p_farbe Farbe des Motorrads
   * @param p_marke Automarke
   * @param p_anzahlGaenge  Anzahl der Gänge
   * @param p_maxGeschwindigkeit Höchstgeschwindigkeit 
   */
    public CMotorrad( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_beiwagen)
    {
        m_farbe = p_farbe;
        m_marke = p_marke;
        m_anzahlGaenge = p_anzahlGaenge;
        m_maxGeschwindigkeit = p_maxGeschwindigkeit;
        m_motorradId=s_id++;
        m_beiwagen = p_beiwagen;
    }

    /**
     * Getter Methode für die eindeutige ID
     * @return der int Wert der ID
     */
    public int getMotorradId(){
        return m_motorradId;
    }

    /**
     * Getter Methode für die aktuelle Geschwindigkeit
     * @return aktueller Wert als int
     */
    public int getAktGeschwindigkeit(){
        return m_aktGeschwindigkeit;
    }
 
    /**
     * Getter Methode für die aktuelle Position des Motorrads. Wir nehmen an, dass
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
     @Override
     public void schalte( final int p_gang )
    {
        // in dieser Implementierung kann man von jedem Gang in jeden anderen schalten
        m_gang = p_gang % (m_anzahlGaenge + 1);
        m_gang = m_gang < 0 ? 0 : m_gang;
    }
    public int getGang(){
        return m_gang;
    }

    /**
     * Realisiert beschleunigen durch Addieren eines positiven ganzzahligen Wertes zur Geschwindikeit 
     * @param p_inkrement zulässiger Wert für Anzahl der Einheiten, die beschleunigt werden
     */
     @Override
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
     @Override
    public void bremse( final int p_dekrement )
    {
        if (p_dekrement < 0) throw new IllegalArgumentException("negative value for decrement: " + p_dekrement);
     
        m_aktGeschwindigkeit -= Math.min(p_dekrement, MAX_VERZOEGERUNG);
        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
    }

    @Override
    public String toString(){
        return "CMotorrad: " + m_marke + " Beiwagen? " + m_beiwagen;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof CMotorrad)) {
            return false;
        }

        CMotorrad motorrad = (CMotorrad) o;

        return motorrad.getMotorradId() == m_motorradId;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(m_motorradId).hashCode();
    }
}
